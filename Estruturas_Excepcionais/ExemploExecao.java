package Estruturas_Excepcionais;

public class ExemploExecao {

  public static void main(String[] args) {
    try {
      String cepFormatado = formatarCep("23765064"); // Exemplo de CEP sem formatação
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      e.printStackTrace(); // Mantém o rastreamento completo da exceção
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8) {
      throw new CepInvalidoException(); // Lança exceção se o CEP não tiver 8 dígitos
    }

    // Simulando um CEP formatado com base no valor real do CEP
    return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5, 8);
  }
}

// Exceção personalizada para CEP inválido
class CepInvalidoException extends Exception {
  public CepInvalidoException() {
    super("O CEP deve ter 8 dígitos.");
  }
}
