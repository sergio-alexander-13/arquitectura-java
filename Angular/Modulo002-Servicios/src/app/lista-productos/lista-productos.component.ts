import { Component, OnInit } from '@angular/core';
import { ProductoService } from '../servicio/producto.service';
import { Producto } from '../dominio/producto';

@Component({
  selector: 'app-lista-productos',
  templateUrl: './lista-productos.component.html',
  styleUrls: ['./lista-productos.component.css']
})
export class ListaProductosComponent implements OnInit {

  productoNuevo: Producto;
  productoEditado: Producto;
  filtroConcepto:string="";
  lista: Producto[] = [];

  constructor(public servicio: ProductoService) {

    this.productoNuevo = new Producto(0, "", 0);

    this.lista = servicio.buscarTodos();

  }

  get listaFiltrada() {

    // estoy utilizando la funcion filter para filtrar la lista completa
    // y quedarme con una lista parcial
    // esa lista parcial es la que estoy realizando un binding con la plantilla

    if (this.filtroConcepto=="") {
      return this.lista;
    }
    return this.lista.filter((p)=>p.concepto.startsWith(this.filtroConcepto));
  }


  ngOnInit() {
  }

  borrar(producto: Producto) {

    this.servicio.borrar(producto);
  }

  insertar(producto: Producto) {

    this.servicio.insertar(producto);
  }

  editar(producto: Producto) {

    this.productoEditado = producto;
  }
  salvar(producto: Producto) {

    console.log("vamos a salvar el producto %o", producto);
  }

}
