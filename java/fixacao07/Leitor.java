package fixacao07;

import java.util.Scanner;

public class Leitor {

  String produto;
  double precoCusto;
  double precoVenda;

  void desconto() {
    if (this.precoVenda - this.precoCusto > 100) {
      System.out.println("Recebeu desconto");
    }
  }
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Leitor leitor = new Leitor();

    System.out.print("Insira o nome do produto: ");
    leitor.produto = scanner.next();
    System.out.print("Quanto custou? ");
    leitor.precoCusto = scanner.nextDouble();
    System.out.print("Por quanto vendeu? ");
    leitor.precoVenda = scanner.nextDouble();

    leitor.desconto();
    scanner.close();
  }

}
