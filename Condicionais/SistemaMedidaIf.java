package Condicionais;

public class SistemaMedidaIf {

  // Sistema de medida em if else
  public static void main(String[] args) {

    String Sigla = "M";

    if (Sigla == "P") {
      System.out.println("PEQUENO");
    } else if (Sigla == "M") {
      System.out.println("MEDIO");
    } else if (Sigla == "G") {
      System.out.println("GRANDE");
    } else {
      System.out.println("Indefinido");
    }
  }
}
