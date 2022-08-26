import * as $ from "jquery";

import {Factura, FacturaConIVA, FacturaSinIVA} from "../../models/models";

export class FacturaService {

     async  findAllFacturas():Promise<FacturaConIVA |FacturaSinIVA[]> {


    //oye realiza una peticion asincrona
    // pero en vez de resolverla y devolver los datos
    // simplemente devuelvo el concepto de peticion
  return    $.get("../facturas");
}

}