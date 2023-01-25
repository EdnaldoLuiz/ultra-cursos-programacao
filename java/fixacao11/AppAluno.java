package fixacao11;

public class AppAluno {
  public static void main (String[] args) {

    Aluno aluno = new Aluno();
    
    aluno.setNome("Luiz");
    aluno.setCurso("Informatica");
    aluno.setNumeroTurma(3);
    aluno.setParcela(3.33);
    aluno.setMedia(8);

    System.out.println(aluno.getNome());
    System.out.println(aluno.getCurso());
    System.out.println(aluno.getNumeroTurma());
    System.out.println(aluno.getParcela());
    System.out.println(aluno.getMedia());
    
  }
}
