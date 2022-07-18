const express = require('express');
const app = express();


app.use(express.static(__dirname + '/dist/trabalho-app'));

app.get('/*', function(req, res) {
  res.sendFile(__dirname + '/dist/trabalho-app/index.html');
});

app.listen(4200);



