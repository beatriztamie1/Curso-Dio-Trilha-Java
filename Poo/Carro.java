package Poo;

public class Carro {

  public void ligar() {
    confereCambio();
    conferindoCombustivel();
    System.out.println("CARRO LIGADO");
  }

  private void conferindoCombustivel() {
    System.out.println("CONFERINDO COMBUSTIVÉL");
  }

  private void confereCambio() {
    System.out.println("CONFERINDO CAMBIO EM P");
  }
}