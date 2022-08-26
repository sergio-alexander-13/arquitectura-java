//var express = require('express');
import * as express from "express";
import {Factura} from "./factura";

var app:express.Application = express();

//strong typing 
var listaFacturas:Factura[]=[];

//listaFacturas.push({"numero":"1","concepto":"ordenador","importe":500});
//listaFacturas.push({"numero":"2","concepto":"telefono","importe":800});
listaFacturas.push(new Factura(1,"ordenador",500));
listaFacturas.push(new Factura(2,"telefono",800));



app.get('/facturas', function (req:express.Request, res:express.Response) {
  res.send(listaFacturas);
});


/*
app.get("/facturas/:numero", function(req:express.Request,res:express.Response) {

  // las funciones flecha son una simplificacion de el manejo de funciones clasico
  // evitando la generacion de ambitos adicionales y simplificando la sintaxis
  let factura=listaFacturas.filter((f:Factura)=> {

        return f.numero==parseInt(req.params.numero);

  })[0];

  res.send(factura);

});*/


app.get("/facturas/:numero", function(req:express.Request,res:express.Response) {

  // las funciones flecha son una simplificacion de el manejo de funciones clasico
  // evitando la generacion de ambitos adicionales y simplificando la sintaxis
  let factura=listaFacturas.find((f:Factura)=> {

        return f.numero==parseInt(req.params.numero);

  });

  res.send(factura);

});


app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});