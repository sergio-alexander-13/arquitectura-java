export function Validador(propiedad: string, limite: number) {



    //para el decorador necesitamos construir una funcion
    //esta funcion recibe el objeto inicial
    // el nombre de la funcion que estamos procesando 
    //la propia funcion en si como referencia

    return function (objeto, nombreFuncion: string, descriptor: PropertyDescriptor) {

        /*
        console.log(objeto);
        console.log(nombreFuncion);
        console.log(descriptor.value);
        */
        //guardo una referencia a la funcion original que teniamos
        //es decir a addLinea

        const fOriginal = descriptor.value;

        //estoy cambiando la funcionalidad
        descriptor.value = function (...args) {

            // simplemente ejecuta la funcion orginal de add linea no hace mas 
            //afectando al metodo add linea y cambiando su comportamiento
            //console.log("la funcion add linea se ejecuta");

            //es esto correcto??
            if (args[0][propiedad] >= limite) {

                console.log(args[0][propiedad]);
            }

            const resultado = fOriginal.apply(this, args);
            return resultado;


        }
    }


}

