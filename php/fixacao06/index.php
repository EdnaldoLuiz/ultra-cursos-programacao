<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
</head>

<body>
  <?php

  $clientes = ["Cliente 01", "Cliente 02", "Cliente 03", "Cliente 04", "Cliente 05","Cliente 06", "Cliente 07", "Cliente 08", "Cliente 09", "Cliente 10"];

  echo ("Quantidade de clientes: " . count($clientes)."<br>");
  sort($clientes);

  foreach($clientes as $cliente) {
    echo($cliente."<br>");
  }

  ?>
</body>

</html>