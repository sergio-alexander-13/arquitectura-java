import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class RESTService<T, K> {

  private servidor: string = "http://localhost:3000";

  constructor(public endPoint: string, public id: K, public http: HttpClient) {



  }
  //lo que acabo es de definir una url generica es decir
  // cuando de de alta un servicio que sea productos
  //la url sera http://localhost:3000/productos
  get url() {

    return `${this.servidor}/${this.endPoint}`;

  }

  public buscarTodos():Observable<T[]> {

    return this.http.get<T[]>(this.url);
  }

  public insertar(tipo:T):Observable<T> {

    return this.http.post<T>(this.url,tipo);
  }
  
  public actualizar(tipo:T):Observable<T> {

    return this.http.put<T>(`${this.url}/${tipo[`${this.id}`]}`,tipo);
  }


  public borrar(tipo:T):Observable<T> {
    //delete
    // http://localhost:3000/productos/id no lo borra
    //return this.http.delete<T>(`${this.url}/${this.id}`)
    // http://localhost:3000/productos/3
    return this.http.delete<T>(`${this.url}/${tipo[`${this.id}`]}`)
  }


  public buscarUno(id:K):Observable<T> {

    return this.http.get<T>(`${this.url}/${id}`);

  }



}
