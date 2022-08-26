import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Producto } from '../dominio/producto';
import { Observable } from 'rxjs';
import { RESTService } from './rest.service';

@Injectable({
  providedIn: 'root'
})
export class ProductosRESTService  extends RESTService<Producto,String>{
  constructor(public  http:HttpClient) {
    super("productos","id",http);

   }
  public buscarPorConcepto(concepto:string):Observable<Producto[]>{

    return this.http.get<Producto[]>(`${this.url}/filtro/${concepto}`)
  }

  
  

  



}
