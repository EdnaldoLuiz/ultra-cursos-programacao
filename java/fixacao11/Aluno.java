package fixacao11;

public class Aluno {

  private String nome, curso;
  private int numeroTurma;
  private double parcela, media;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCurso() {
    return this.curso;
  }

  public void setCurso(String curso) {
    this.curso = curso;
  }

  public int getNumeroTurma() {
    return this.numeroTurma;
  }

  public void setNumeroTurma(int numeroTurma) {
    this.numeroTurma = numeroTurma;
  }

  public double getParcela() {
    return this.parcela;
  }

  public void setParcela(double parcela) {
    this.parcela = parcela;
  }

  public double getMedia() {
    return this.media;
  }

  public void setMedia(double media) {
    this.media = media;
  }
  
}