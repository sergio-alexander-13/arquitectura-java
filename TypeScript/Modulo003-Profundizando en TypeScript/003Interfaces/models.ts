
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

    

    

    addLinea(linea:LineaFactura) {

        this.lineas.push(linea);
    }

    abstract calcularTotalIVA();

    
  
}

export class FacturaSinIVA extends Factura {
    calcularTotalIVA() {
       
        return this.importe;

    }


}

export class FacturaConIVA extends Factura {

    
    calcularTotalIVA() {
      
        return this.importe*1.21;
    }


}

export class LineaFactura {


    constructor(public numero:number,public concepto:string,public importe:number) {


    }
}

export interface FacturaSimpleDTO {

    numero:number;
    conceptolinea:string;
}






