import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators'
import { UserModel } from 'src/app/core/model/user.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  listar(id):Observable<UserModel>{
    return this.http.get<UserModel>(this.url + '/user/buscar/'+ id, this.httpOptions)
      .pipe(
        retry(1)
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
