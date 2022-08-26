//booleano
let verdadero:boolean=true;

console.log(verdadero);
//numero

let numero:number=5;
console.log(numero);

let texto:string="hola que tal";
console.log(texto);

let lista:string[]=["hola","que","tal"];
console.log(lista);

let tupla:[number,string]=[1,"cecilio"];

console.log(tupla[0]);
console.log(tupla[1]);

let tupla2:[number,string,string,number]=[1,"cecilio","alvarez",44];

tupla2.forEach(function(e) {

    console.log(e);
})

enum Color  {Azul,Rojo,Verde};

let color1= Color.Azul;
let color2= Color.Azul;

if (color1==color2) {

    console.log("los dos colores son iguales");
}

let miVariable:any="hola";
console.log(miVariable);
miVariable=5;
console.log(miVariable);





