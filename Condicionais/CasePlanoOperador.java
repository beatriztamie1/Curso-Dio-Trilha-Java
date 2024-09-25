package Condicionais;

public class CasePlanoOperador {
    public static void main(String[] args) {
      String plano = "T"; // M / T / B
  
      // Verificação do plano usando switch
      switch (plano) {
        case "T":
          System.out.println("5GB YouTube");
          break;
        case "M":
          System.out.println("WhatsApp e Instagram grátis");
          break;
        case "B":
          System.out.println("100 minutos de ligação");
          break;
        default:
          System.out.println("Plano inválido");
          break;
      }
    }
  }
  
