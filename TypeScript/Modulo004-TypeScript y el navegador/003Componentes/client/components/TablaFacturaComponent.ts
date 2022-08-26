import { Factura } from "../../models/models";
import * as $ from "jquery";
import * as _ from "lodash";
export class TablaFacturaComponent {


    constructor(public selector:string,public facturas:Factura[]) {


    }

    render() {
        $(`#${this.selector}`).remove();
        let plantilla=`<table id="${this.selector}">
                        <tr>
                            <th><a class="numero" href="#">Numero</a></th>
                            <th><a class="concepto" href="#">Concepto</a></th>
                            <th><a class="importe" href="#">Importe</a></th>
                        </tr>
                        ${this.facturas.map(f=>`<tr><td>${f.numero}</td><td>${f.concepto}</td><td>${f.importe}</td></tr>`)}
                        </table>
                        `;
        $("body").append(plantilla);  

        // seleccionamos el body + el selector de #mitabla + el selector de clase .numero
        //por lo tanto un ejemplo de selector seria body #mitabla .concepto
        // a este le añadimos un evento de click
        $(`body #${this.selector} .concepto`).click(()=>this.ordenar("concepto"));
        $(`body #${this.selector} .numero`).click(()=>this.ordenar("numero"));
        $(`body #${this.selector} .importe`).click(()=>this.ordenar("importe"));
        


    }


    private ordenar(columna:string) {

        console.log("ordenando por"+ columna);

        this.facturas=_.orderBy(this.facturas,[columna]);
        this.render();
    }
}