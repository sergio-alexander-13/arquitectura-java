
import * as express from "express";
import {Factura} from "./factura";
import {FacturaController} from "./facturaController";

var app:express.Application = express();
var facturaController:FacturaController= new FacturaController(app);
facturaController.findAll();
facturaController.findOne();
/*

var listaFacturas:Factura[]=[];


listaFacturas.push(new Factura(1,"ordenador",500));
listaFacturas.push(new Factura(2,"telefono",800));



app.get('/facturas', function (req:express.Request, res:express.Response) {
  res.send(listaFacturas);
});



app.get("/facturas/:numero", function(req:express.Request,res:express.Response) {

  let factura=listaFacturas.find((f:Factura)=> {

        return f.numero==parseInt(req.params.numero);

  });

  res.send(factura);

});

*/
app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});