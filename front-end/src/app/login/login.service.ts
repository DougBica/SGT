import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { LoginModel } from './model/login.model';
import { retry, catchError } from 'rxjs/operators'
import { UserModel } from '../core/model/user.model';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  login(login):Observable<UserModel>{
    return this.http.post<UserModel>(this.url + '/user/aut', JSON.stringify(login), this.httpOptions)
      .pipe(
        retry(1),
        catchError(this.handleError)
      )
  }

  handleError(error){
    let msgErro ='';
    if(error.error instanceof ErrorEvent){
      //Cliente Side
      msgErro = error.error.message;
    } else {
      //Server Side
      msgErro = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    window.alert(msgErro)
    return throwError(msgErro);
  }
}
