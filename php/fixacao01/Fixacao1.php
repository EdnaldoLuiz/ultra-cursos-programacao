<?php

$codigoProduto = 1728982;
$descricao = " É importado da Holanda ";
$estoqueTotal = 378;
$qtdVendida = 124;
$qtdAtual = $estoqueTotal - $qtdVendida;
$preco = 23.50;
$vendasTotal = $qtdVendida * $preco;

echo $codigoProduto."<br>";
echo "Descrição: ".$descricao."<br>";
echo "Total em estoque: ".$estoqueTotal."<br>";
echo "Quantidade vendida: ".$qtdVendida."<br>";
echo "Atualmento temos ".$qtdAtual." produtos<br>";
echo "Preço: ".$preco."<br>";
echo "Total de vendas: ".$vendasTotal;

?>