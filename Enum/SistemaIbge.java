package Enum;

//enum
public class SistemaIbge {
  public static void main(String[] args) {
    // Iterando sobre todos os valores da enumeração
    for (EstadosBrasileiros e : EstadosBrasileiros.values()) {
      System.out.println(e.getSigla() + " - " + e.getNome());
    }

    // Exemplo específico com o estado Piauí
    EstadosBrasileiros eb = EstadosBrasileiros.PIAUI;

    System.out.println("\nInformações sobre Piauí:");
    System.out.println("Nome: " + eb.getNome());
    System.out.println("Sigla: " + eb.getSigla());
    System.out.println("Nome em maiúsculo: " + eb.getMaiusculo());
    System.out.println("Código IBGE: " + eb.getIbge());
  }
}
