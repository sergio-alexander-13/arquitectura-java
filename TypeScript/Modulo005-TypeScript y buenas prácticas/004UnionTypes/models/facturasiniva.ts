import { Factura } from "./factura";

export class FacturaSinIVA extends Factura {
    calcularTotalIVA() {
       
        return this.importe;

    }


}
