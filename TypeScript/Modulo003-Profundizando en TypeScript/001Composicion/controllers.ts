import * as express from "express";
import {Factura, LineaFactura, FacturaConIVA} from "./models"

export class FacturaController {

listaFacturas:Factura[]=[];
app:express.Application;

constructor(app:express.Application) {
    this.app=app;

    let factura1=new FacturaConIVA(1,"ordenador");
    let factura2= new FacturaConIVA(2,"telefono");

    factura1.addLinea(new LineaFactura(1,"cpu",300));
    factura1.addLinea(new LineaFactura(2,"monitor",200));

    factura2.addLinea(new LineaFactura(1,"terminal",500));
    factura2.addLinea(new LineaFactura(2,"auriculares",300));

    this.listaFacturas.push(factura1);
    this.listaFacturas.push(factura2);

}


findAll() {

    this.app.get('/facturas',  (req:express.Request, res:express.Response)=> {

        //el tema del ambito del operador this

        let nuevaLista= this.listaFacturas.map((f:Factura)=> {
            // parte la factura en dos primera parte las lineas segunda parte el resto de propiedades
           // const {lineas,...resto}=f;
            //para cada factura devuelve el resto de propiedades
            
            //resto["importe"]=f.importe;
            return this.transformarFacturaJSON(f);
        })
        
        
        res.send(nuevaLista);
      });

}


findOne() {

    

this.app.get("/facturas/:numero", (req:express.Request,res:express.Response)=> {

    let factura=this.listaFacturas.find((f:Factura)=> {
  
          return f.numero==parseInt(req.params.numero);
  
    });

    //const {lineas,...resto}=factura;
    //resto["importe"]=factura.importe;
  
    res.send(this.transformarFacturaJSON(factura));
  
  });
}


findAllLineasFactura() {

    

    this.app.get("/facturas/:numero/lineas", (req:express.Request,res:express.Response)=> {
    
        let factura=this.listaFacturas.find((f:Factura)=> {
      
              return f.numero==parseInt(req.params.numero);
      
        });
    
        const {lineas,...resto}=factura;
        
      
        res.send(lineas);
      
      });
    }


    findLineaFactura() {

    

        this.app.get("/facturas/:numero/lineas/:numerolinea", (req:express.Request,res:express.Response)=> {
        
            let factura=this.listaFacturas.find((f:Factura)=> {
          
                  return f.numero==parseInt(req.params.numero);
          
            });
        
            const {lineas,...resto}=factura;
            
            let linea= lineas.find((lf:LineaFactura)=> {

                    return lf.numero==req.params.numerolinea;

            })
          
            res.send(linea);
          
          });
        }

        private transformarFacturaJSON(factura:Factura):any {
            //destructuring
            const {lineas,...resto}=factura;
            resto["importe"]=factura.importe;
            return resto;

        }

}



