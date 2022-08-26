import * as $ from "jquery";

import {FacturaConIVA, LineaFactura} from "../models/models";

let listaFactura:FacturaConIVA[]=[];


$(document).ready(function() {

let f1= new FacturaConIVA(1,"ordenador");
f1.addLinea(new LineaFactura(1,"ordenador",500));
let f2=new FacturaConIVA(2,"telefono");
f2.addLinea(new LineaFactura(1,"telefono",800));

listaFactura.push(f1);
listaFactura.push(f2);

crearTabla(listaFactura);




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


function crearTabla(lista) {

    
        $("#mitabla").append(`${lista.map(f=>`<tr><td>${f.numero}</td><td>${f.concepto}</td></tr>`)}`);  
    
}
