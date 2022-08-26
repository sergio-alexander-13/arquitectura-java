import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from "@angular/forms"
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListaProductosComponent } from './lista-productos/lista-productos.component';
import { HttpClientModule } from '@angular/common/http';
import { FormularioProductosComponent } from './formulario-productos/formulario-productos.component';
import { DetalleProductosComponent } from './detalle-productos/detalle-productos.component';
import { FormularioProductosEdicionComponent } from './formulario-productos-edicion/formulario-productos-edicion.component';
import { ErrorComponent } from './error/error.component';

@NgModule({
  declarations: [
    AppComponent,
    ListaProductosComponent,
    FormularioProductosComponent,
    DetalleProductosComponent,
    FormularioProductosEdicionComponent,
    ErrorComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
