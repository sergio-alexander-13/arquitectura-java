import * as express from "express";
import {Factura} from "./factura"

export class FacturaController {

listaFacturas:Factura[]=[];
app:express.Application;

constructor(app:express.Application) {
    this.app=app;
    this.listaFacturas.push(new Factura(1,"ordenador",500));
    this.listaFacturas.push(new Factura(2,"telefono",800));

}


findAll() {

    this.app.get('/facturas',  (req:express.Request, res:express.Response)=> {

        //el tema del ambito del operador this
        res.send(this.listaFacturas);
      });

}
findOne() {

    

this.app.get("/facturas/:numero", (req:express.Request,res:express.Response)=> {

    let factura=this.listaFacturas.find((f:Factura)=> {
  
          return f.numero==parseInt(req.params.numero);
  
    });
  
    res.send(factura);
  
  });
}


}