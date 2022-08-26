import { Factura } from "./factura";

export class FacturaConIVA extends Factura {

    
    calcularTotalIVA() {
      
        return this.importe*1.21;
    }


}