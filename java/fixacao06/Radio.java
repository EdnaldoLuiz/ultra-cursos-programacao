package fixacao06;

public class Radio {

  String fabricante = "Philips";
  String tamanho = "medio";
  boolean ligado = true;

  void ligar() {
    if (this.ligado == true) {
      System.out.println("ligado");
    } else {
      System.out.println("desligado");
    }
  }

  void status() {
    System.out.println("Seu fabricabte é: " + this.fabricante);
    System.out.println("Seu tamanho é: " + this.tamanho);
  }

  public static void main(String[] args) {

    Radio radio = new Radio();

    radio.status();
    radio.ligar();

  }

}
