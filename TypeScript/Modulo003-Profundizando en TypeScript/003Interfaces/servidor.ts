
import * as express from "express";
import {Factura} from "./models";
import {FacturaController} from "./controllers";

var app:express.Application = express();
var facturaController:FacturaController= new FacturaController(app);
facturaController.findSimplificadas();
facturaController.findTotalFacturas();
facturaController.findTotalFacturasConIVA();
facturaController.findAll();
facturaController.findOne();
facturaController.findAllLineasFactura();
facturaController.findLineaFactura();



app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});