import { Component, OnInit } from '@angular/core';
import { Producto } from '../dominio/producto';
import { ProductosRESTService } from '../servicio/productos-rest.service';
import { flatMap, map } from "rxjs/operators";
import { Subject } from 'rxjs';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-lista-productos',
  templateUrl: './lista-productos.component.html',
  styleUrls: ['./lista-productos.component.css']
})
export class ListaProductosComponent implements OnInit {

 
  productoEditado: Producto;
  filtroConcepto: string = "";
  lista: Producto[] = [];

  keyUp= new Subject<KeyboardEvent>();



  constructor(public servicio: ProductosRESTService,public router:Router) {

    

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

  

  editar(producto: Producto) {

    this.productoEditado = producto;
  }

  detalle(producto:Producto) {

    this.router.navigate(["detalle",producto.id]);
  }

  editar2(producto:Producto) {

    this.router.navigate(["formularioEdicion",producto.id]);
  }



  salvar(producto: Producto) {


    this.servicio.actualizar(producto).pipe(flatMap(e => this.servicio.buscarTodos()))
      .subscribe(datos => {

        this.lista = datos;

      })

  }


  borrarProductoEvento(producto:Producto) {

   
    this.borrar(producto);

  }


  detalleProductoEvento(producto:Producto) {

    this.detalle(producto);

  }

  editar2ProductoEvento(producto:Producto) {

    this.editar2(producto);
  }

  editarProductoEvento(producto:Producto) {

    this.editar(producto);
  }

  salvarProductoEvento(producto:Producto) {

    this.salvar(producto);
  }
}
