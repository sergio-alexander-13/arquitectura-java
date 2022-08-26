
import * as express from "express";
import {Factura} from "./models";
import {FacturaController} from "./controllers";

var app:express.Application = express();
var facturaController:FacturaController= new FacturaController(app);
facturaController.findAll();
facturaController.findOne();

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});