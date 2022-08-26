import { Component, OnInit } from '@angular/core';
import { Producto } from '../dominio/producto';
import { ProductosRESTService } from '../servicio/productos-rest.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-detalle-productos',
  templateUrl: './detalle-productos.component.html',
  styleUrls: ['./detalle-productos.component.css']
})
export class DetalleProductosComponent implements OnInit {

  producto:Producto;
  constructor(public servicio:ProductosRESTService,public route:ActivatedRoute) { 

    //acceso a un servicio REST que acceda a la url que acabamos de construir

  }

  ngOnInit() {

    this.route.paramMap.subscribe((parametros)=>{

          this.servicio.buscarUno(parametros.get("id")).subscribe((datos)=>{

            this.producto=datos;
          })

    })

   


  }

}
