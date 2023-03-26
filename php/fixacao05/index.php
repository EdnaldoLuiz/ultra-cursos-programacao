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
    $nome = "DAIANA DA SILVA";
    $frase = "O medo cega os nossos sonhos.";

    $novoNome = strtolower($nome);
    $novaFrase = strtoupper($frase);

    echo("Nome: ".$novoNome."<br>"."Frase: ".$novaFrase);
  ?>

</body>
</html>