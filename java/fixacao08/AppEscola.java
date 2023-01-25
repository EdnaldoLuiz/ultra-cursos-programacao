package fixacao08;

import java.util.Scanner;

public class AppEscola {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    Escola uninassau = new Escola();

    System.out.print("Nome do aluno: ");
    uninassau.aluno = leitor.next();
    System.out.print("Nome da turma: ");
    uninassau.turma = leitor.next();

    for (int i = 0; i < uninassau.nota.length; i++) {
      System.out.print("Informe a nota " + (i + 1) + ": ");
      uninassau.nota[i] = leitor.nextDouble();
    }

    leitor.close();

  }
}
