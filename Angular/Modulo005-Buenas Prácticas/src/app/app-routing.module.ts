import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListaProductosComponent } from './lista-productos/lista-productos.component';
import { FormularioProductosComponent } from './formulario-productos/formulario-productos.component';
import { DetalleProductosComponent } from './detalle-productos/detalle-productos.component';
import { FormularioProductosEdicionComponent } from './formulario-productos-edicion/formulario-productos-edicion.component';
import { ErrorComponent } from './error/error.component';


const routes: Routes = [

{path:"lista", component:ListaProductosComponent},
{path:"detalle/:id", component:DetalleProductosComponent},
{path:"formularioEdicion/:id", component:FormularioProductosEdicionComponent},
{path:"formulario", component:FormularioProductosComponent},
{path:"" ,redirectTo:"/lista",pathMatch:"full"},
{path:"error", component:ErrorComponent},
{path:"**", redirectTo:"/error", pathMatch:"full"}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
