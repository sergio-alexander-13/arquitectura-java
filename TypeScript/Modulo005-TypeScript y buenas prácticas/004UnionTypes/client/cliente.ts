import * as $ from "jquery";

import {FacturaConIVA, LineaFactura, Factura} from "../models/models";
import { FacturaService } from "./services/facturaService";
import { TablaFacturaComponent } from "./components/TablaFacturaComponent";
import { RESTService } from "./services/RESTService";


let listaFactura:FacturaConIVA[]=[];


$(document).ready(function() {

    /*
let f1= new FacturaConIVA(1,"ordenador");
f1.addLinea(new LineaFactura(1,"ordenador",500));
let f2=new FacturaConIVA(2,"telefono");
f2.addLinea(new LineaFactura(1,"telefono",800));
let f3=new FacturaConIVA(3,"camara");
f3.addLinea(new LineaFactura(1,"camara",100));



listaFactura.push(f1);
listaFactura.push(f2);
listaFactura.push(f3);
//crearTabla(listaFactura);
*/
/*
$.get("../facturas",function(listadatos) {

    let componente= new TablaFacturaComponent("mitabla",listadatos);
    componente.render();

})
*/

//let miservicio= new FacturaService();

let miservicio= new RESTService<Factura>("http://localhost:3000/facturas");



// tiene la ventaja de que aislamos y separamos responsabilidades
// sin embargo no tiene mucha logica que sea el servicio el que 
//crea el componente
/*miservicio.findAllFacturas().then(function(listadatos) {

    let componente= new TablaFacturaComponent("mitabla",listadatos);
    componente.render();

});*/

let componente= new TablaFacturaComponent("mitabla",miservicio);




});
/*
function crearTabla(lista) {

    // una parte la construyo con javascript
    lista.forEach((f:FacturaConIVA)=> {
        //otra parte con plantillas puras
        // javascript es6 templates dentro de typescript
        $("#mitabla").append(`<tr><td>${f.numero}</td><td>${f.concepto}</td></tr>`);
    })
    
}*/

/*
function crearTabla(lista) {

    
        $("#mitabla").append(`${lista.map(f=>`<tr><td>${f.numero}</td><td>${f.concepto}</td></tr>`)}`);  
    
}*/
