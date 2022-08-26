var express = require('express');
var cors = require("cors");
var bodyParser=require("body-parser");
const jwt = require('jsonwebtoken');
const expressJwt = require('express-jwt');
var app = express();

app.use(expressJwt({secret: 'superclave'}).unless({path: ['/login']}));
app.use(cors());
app.use(bodyParser.json());

let lista = [];

lista.push({ "id": "3", "concepto": "auriculares", "importe": "200" ,"categoria":"informatica"});
lista.push({ "id": "4", "concepto": "patinete", "importe": "500" ,"categoria":"deporte"});


app.post("/login",function(req,res){


  /// en formato json desde la pagina
const usuario=req.body;
if (usuario.nombre=="cecilio" && usuario.clave=="cecilio") {

    var token= jwt.sign({id:usuario.nombre},'superclave',{expiresIn:'2h'});
    res.send({token});

} else {

  // no tenemos acceso esto es lo que se esta ejecutando
  res.sendStatus(401);
}

});



app.get('/productos', function (req, res) {
  res.send(lista);
});

app.get("/productos/filtro",function(req, res) {

  res.send(lista);

})



app.get("/productos/:id",function(req,res) {


  let listaFiltrada = lista.filter(function (elemento) {

    return elemento.id==req.params.id;
  });

  res.send(listaFiltrada[0]);


})

app.get("/productos/filtro/:concepto",function(req,res) {


  let listaFiltrada = lista.filter(function (elemento) {

    return elemento.concepto.startsWith(req.params.concepto);
  });

  res.send(listaFiltrada);


})



app.delete("/productos/:id", function (req, res) {

  //seleccion  el elemento a borrar
  let seleccionado = lista.filter(function (elemento) {

    return elemento.id == req.params.id;
  })[0];
  //localizo su posicion
  let indice = lista.indexOf(seleccionado);
  // borro el elemento
  lista.splice(indice, 1);
  //envio un status code de borrado
  res.status(204).send();
})

app.post("/productos",function(req,res) {

  lista.push(req.body);
  res.status(201).send();

})



app.put("/productos/:id", function (req, res) {

  //seleccion  el elemento a borrar
  let seleccionado = lista.filter(function (elemento) {

    return elemento.id == req.params.id;
  })[0];
  // esta es la parte pura de actualizacion
  
  let indice= lista.indexOf(seleccionado);
  lista[indice]=req.body;
  
  res.status(200).send();
})



app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});