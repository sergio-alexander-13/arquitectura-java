import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Producto } from '../dominio/producto';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProductosRESTService {

  constructor(private http:HttpClient) { }

  public buscarTodos():Observable<Producto[]> {

   return  this.http.get<Producto[]>("http://localhost:3000/productos");
  }

  public buscarPorConcepto(concepto:string):Observable<Producto[]>{

    return this.http.get<Producto[]>(`http://localhost:3000/productos/filtro/${concepto}`)
  }

  //porque siempre hay que intentar cumplir con el standard
  // que un servicio cuando buscamos por id nos devuelte un elemento
  //no un array con el elemento dentro
  public buscarUno(id:string):Observable<Producto> {

    return this.http.get<Producto>(`http://localhost:3000/productos/detalle/${id}`)

  }
  

  public borrar(producto:Producto):Observable<Producto> {
    //hay que mezclar tecnologias
    return this.http.delete<Producto>(`http://localhost:3000/productos/${producto.id}`);
  }

  public insertar(producto:Producto):Observable<Producto> {

    return this.http.post<Producto>("http://localhost:3000/productos",producto);

  }

  public actualizar(producto:Producto):Observable<Producto> {
    //hay que mezclar tecnologias
    return this.http.put<Producto>(`http://localhost:3000/productos/${producto.id}`,producto);
  }



}
