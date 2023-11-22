//package aula02;
public class caneta {
  public String cor;
  protected int carga;
  protected boolean tampada;
  public String modelo;
  private float ponta;

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String m) {
    this.modelo = m;
  }

  public float getPonta() {
    return this.ponta;
  }

  public void setPonta(float p) {
    this.ponta = p;
  }

  void status() {
    System.out.println("Modelo da caneta: " + this.getModelo());
    System.out.println("Ponta da caneta: " + this.getPonta());
  }

  public void rabiscar() {
    if (tampada == true) {
      System.out.println("Nao tem como rabiscar ");
    } else {
      System.out.println("Estou rabiscando ");
    }
  }

  protected void tampar() {
    this.tampada = true;
  }

  protected void destampar() {
    this.tampada = false;
  }

}