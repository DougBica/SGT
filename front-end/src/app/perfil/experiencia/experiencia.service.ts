import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators'
import { HistoricoTrabalhoModel } from 'src/app/core/model/historicoTrabalho.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {

  url = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
      'Content-Type':'application/json'
    })
  }

  listar(id):Observable<Array<HistoricoTrabalhoModel>>{
    return this.http.get<Array<HistoricoTrabalhoModel>>(this.url + '/historico/listar/'+ id, this.httpOptions)
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
