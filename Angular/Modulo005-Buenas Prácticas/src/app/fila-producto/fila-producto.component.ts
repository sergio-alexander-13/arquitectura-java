import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { Producto } from '../dominio/producto';

@Component({
  selector: 'app-fila-producto',
  templateUrl: './fila-producto.component.html',
  styleUrls: ['./fila-producto.component.css']
})
export class FilaProductoComponent implements OnInit {


  //no pertenecen realmente a este componente
  //sino que pertenecian al componente padre 

  @Input() productoEditado: Producto;
  @Input() producto:Producto;
  //acabo de generar un evento de salida
  @Output() eventoBorrar= new EventEmitter<Producto>();
  @Output() eventoDetalle= new EventEmitter<Producto>();
  @Output() eventoEditar2= new EventEmitter<Producto>();
  @Output() eventoEditar= new EventEmitter<Producto>();
  @Output() eventoSalvar= new EventEmitter<Producto>();
  constructor() { }

  ngOnInit() {
  }

  borrar(producto:Producto):void {
   this.eventoBorrar.emit(producto);
    //no dispongo de la funcionalidad del producto a lahora de borrar

  }
  detalle(producto:Producto):void {

    this.eventoDetalle.emit(producto);

  }
  editar2(producto:Producto):void {

    this.eventoEditar2.emit(producto);
  }

  editar(producto:Producto):void {

    this.eventoEditar.emit(producto);
  }
  salvar(producto:Producto):void {

    this.eventoSalvar.emit(producto);
  }

}
