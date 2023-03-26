<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="php.css">
  <title>Document</title>
</head>

<body>
  <div>
    <?php
      $codigoProduto = 1728982;
      $descricao = " É importado da Holanda ";
      $estoqueTotal = 378;
      $qtdVendida = 124;
      $qtdAtual = $estoqueTotal - $qtdVendida;
      $preco = 23.50;
      $vendasTotal = $qtdVendida * $preco;
    ?>
  </div>
  <div class="mensagens">
    <?php
    echo "Código do produto: " . $codigoProduto . "<br>";
    echo "Descrição: " . $descricao . "<br>";
    echo "Total em estoque: " . $estoqueTotal . "<br>";
    echo "Quantidade vendida: " . $qtdVendida . "<br>";
    echo "Atualmento temos: " . $qtdAtual . " produtos<br>";
    echo "Preço: " . $preco . "<br>";
    echo "Total de vendas: " . $vendasTotal;
    ?>
  </div>
</body>

</html>