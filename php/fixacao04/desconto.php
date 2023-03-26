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

  $salario = $_POST['salario'];

  switch (true) {

    case $salario <= 1045:
      echo ("7,5% de desconto");
      break;

    case $salario <= 1045.01 || $salario <= 2089.60:
      echo ("9% de desconto");
      break;

    case $salario <= 2089.61 || $salario <= 3134.40:
      echo ("12% de desconto");
      break;

    case $salario <= 3134.41 || $salario <= 6101.06:
      echo ("14% de desconto");
      break;
  }

  ?>
</body>

</html>