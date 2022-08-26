var express = require('express');
var app = express();

listaFacturas=[];

listaFacturas.push({"numero":"1","concepto":"ordenador","importe":500});
listaFacturas.push({"numero":"2","concepto":"telefono","importe":800});


app.get('/facturas', function (req, res) {
  res.send(listaFacturas);
});

app.listen(3000, function () {
  console.log('Example app listening on port 3000!');
});