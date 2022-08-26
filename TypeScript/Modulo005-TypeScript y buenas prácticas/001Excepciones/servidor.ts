
import * as express from "express";
import {Factura} from "./models/models";
import {FacturaController} from "./controllers/controllers";



var app:express.Application = express();
var facturaController:FacturaController= new FacturaController(app);
facturaController.findSimplificadas();
facturaController.findTotalFacturas();
facturaController.findTotalFacturasConIVA();
facturaController.findAll();
facturaController.findOne();
facturaController.findAllLineasFactura();
facturaController.findLineaFactura();
app.use("/client",express.static("client"));


app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});