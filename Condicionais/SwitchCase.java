package Condicionais;

public class SwitchCase {
  public static void main(String[] args) {

    String Sigla = "M";

    switch (Sigla) {
      case "P": {
        System.out.println("PEQUENO");
        break;
      }
      case "M": {
        System.out.println("MEDIO");
        break;
      }
      case "G": {
        System.out.println("GRANDE");
        break;
      }
      default:
        System.out.println("Indefinido");
    }

  }
}
