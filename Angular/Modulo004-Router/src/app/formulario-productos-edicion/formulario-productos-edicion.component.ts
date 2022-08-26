import { Component, OnInit } from '@angular/core';
import { Producto } from '../dominio/producto';
import { ActivatedRoute, Router } from '@angular/router';
import { ProductosRESTService } from '../servicio/productos-rest.service';
import { flatMap } from 'rxjs/operators';

@Component({
  selector: 'app-formulario-productos-edicion',
  templateUrl: './formulario-productos-edicion.component.html',
  styleUrls: ['./formulario-productos-edicion.component.css']
})
export class FormularioProductosEdicionComponent implements OnInit {

  productoEditar: Producto= new Producto();
  constructor(public servicio: ProductosRESTService, public router:Router ,public route: ActivatedRoute) { }

  ngOnInit() {

    this.route.paramMap.subscribe((parametros) => {

      this.servicio.buscarUno(parametros.get("id")).subscribe((datos) => {

        this.productoEditar = datos;
      })

    })


  }

  salvar() {

    this.servicio.actualizar(this.productoEditar)
    .subscribe(() => {

      this.router.navigate(['/lista']);


    })
  }

}
