import * as $ from "jquery";

import {FacturaConIVA} from "../models/models";

let listaFactura:FacturaConIVA[]=[];


$(document).ready(function() {

listaFactura.push(new FacturaConIVA(1,"ordenador"));
listaFactura.push(new FacturaConIVA(2,"telefono"));

listaFactura.forEach((f:FacturaConIVA)=> {

    $("#mitabla").append("<tr><td>"+f.numero+"</td><td>"+f.concepto+"</td></tr>");
})



})