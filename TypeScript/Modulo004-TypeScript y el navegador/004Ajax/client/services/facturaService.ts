import * as $ from "jquery";

import {Factura} from "../../models/models";

export class FacturaService {

findAllFacturas():Promise<Factura[]> {

    //oye realiza una peticion asincrona
    // pero en vez de resolverla y devolver los datos
    // simplemente devuelvo el concepto de peticion
   return  $.get("../facturas");
}

}
