import {LineaFactura} from "./lineafactura"
import {Validador} from "../decorators/validador"
export  abstract class Factura {

    //estamos utilizando o creando una relacion de composicion
    // una factura contiene n lineas
   lineas:LineaFactura[]=[];

    constructor(public numero:number,public concepto:string) {
    }
    //metodo calculado esa es una diferencia importante
   // al decalrarlo como propiedades pues la transformacion a json fuera automatica
     get importe() {

        let total= this.lineas.reduce((a:number,lf:LineaFactura)=> {

                    return a+ lf.importe;
        },0);
        return total;
    }

    

    
    @Validador("numero",2)
    addLinea(linea:LineaFactura) {

     
        this.lineas.push(linea);
    }

    abstract calcularTotalIVA();

    
  
}