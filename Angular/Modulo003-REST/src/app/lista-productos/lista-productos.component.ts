import { Component, OnInit } from '@angular/core';
import { Producto } from '../dominio/producto';
import { ProductosRESTService } from '../servicio/productos-rest.service';
import { flatMap, map } from "rxjs/operators";
import { Subject } from 'rxjs';

@Component({
  selector: 'app-lista-productos',
  templateUrl: './lista-productos.component.html',
  styleUrls: ['./lista-productos.component.css']
})
export class ListaProductosComponent implements OnInit {

  productoNuevo: Producto;
  productoEditado: Producto;
  filtroConcepto: string = "";
  lista: Producto[] = [];

  keyUp= new Subject<KeyboardEvent>();



  constructor(public servicio: ProductosRESTService) {

    this.productoNuevo = new Producto(0, "", 0);

    this.keyUp.pipe(map((event:any)=> {
      
        return event.target.value;
        
    })).pipe(flatMap((texto)=> {
        // pero esta es una peticion asincrona
        // y tiene sus peculidaridades
        return this.servicio.buscarPorConcepto(texto);

    })).subscribe((datos)=>{

     this.lista=datos;
    })


  }

 

  /*
  get listaFiltrada() {

    // estoy utilizando la funcion filter para filtrar la lista completa
    // y quedarme con una lista parcial
    // esa lista parcial es la que estoy realizando un binding con la plantilla

    if (this.filtroConcepto=="") {
      return this.lista;
    }
    return this.lista.filter((p)=>p.concepto.startsWith(this.filtroConcepto));
  }

  */

  ngOnInit() {

    this.servicio.buscarTodos().subscribe((datos) => {

      this.lista = datos;

    })

  }


  borrar(producto: Producto) {

    //pues lo que quiero es que invoques otro observable
    this.servicio.borrar(producto).pipe(flatMap(e => this.servicio.buscarTodos()))
      .subscribe(datos => {

        this.lista = datos;

      })

  }

  insertar(producto: Producto) {

    this.servicio.insertar(producto).pipe(flatMap(e => this.servicio.buscarTodos()))
      .subscribe(datos => {

        this.lista = datos;

      })
  }

  editar(producto: Producto) {

    this.productoEditado = producto;
  }

  salvar(producto: Producto) {


    this.servicio.actualizar(producto).pipe(flatMap(e => this.servicio.buscarTodos()))
      .subscribe(datos => {

        this.lista = datos;

      })

  }

}
