package fixacao02;

public class Fixacao02 {
  public static void main(String[] args) {

    String cidade = "Recife";
    int idade = 20;

    if (idade >= 18 && cidade.equalsIgnoreCase("Montenegro")) {
      System.out.println("Etapa Concluída!");
    } else {
      System.out.println("Tente novamente");
    }

  }
}
