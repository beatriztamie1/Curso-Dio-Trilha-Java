package Condicionais;

public class PlanoOperadora {
  public static void main(String[] args) {
    // Declaração da variável
    String plano = "M"; // M / T

    if (plano.equals("B")) {
      System.out.println("100 minutos de ligação");
    } else if (plano.equals("M")) {
      System.out.println("100 minutos de ligação");
      System.out.println("WhatsApp e Instagram grátis");
    } else if (plano.equals("T")) {
      System.out.println("100 minutos de ligação");
      System.out.println("WhatsApp e Instagram grátis");
      System.out.println("5GB YouTube");
    } else {
      System.out.println("Plano inválido");
    }
  }
}
