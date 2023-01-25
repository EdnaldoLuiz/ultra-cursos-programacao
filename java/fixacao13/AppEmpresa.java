package fixacao13;

public class AppEmpresa {
  public static void main(String[] args) {

    Gerente gerente = new Gerente();
    gerente.setNome("Luiz");
    gerente.setSalario(8954.65);
    gerente.setSenha("llka69#g%gyk");

    System.out.println("Nome do gerente: " + gerente.getNome());
    System.out.println("Salário do gerente: " + gerente.getSalario());
    System.out.println("Senha do gerente: " + gerente.getSenha());
  }

}
