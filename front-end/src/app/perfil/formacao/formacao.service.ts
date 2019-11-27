import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators'
import { FormacaoModel } from 'src/app/core/model/formacao.model';

@Injectable({
  providedIn: 'root'
})
export class FormacaoService {

  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  listar(id):Observable<Array<FormacaoModel>>{
    return this.http.get<Array<FormacaoModel>>(this.url + '/formacao/listar/'+ id, this.httpOptions)
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
