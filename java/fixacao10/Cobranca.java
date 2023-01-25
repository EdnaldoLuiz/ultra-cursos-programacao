package fixacao10;

public class Cobranca {

  String produto;
  double preco;
  final double acrescimo = 0.10;

  Cobranca(String produto, double preco) {
    this.produto = produto;
    this.preco = preco;
  }

  double formula1() {
    System.out.print("Valor do acréscimo: ");
    return acrescimo * preco;
  }

  double formula2() {
    System.out.print("Valor total a pagar: ");
    return preco + (acrescimo * preco);
  }

}
