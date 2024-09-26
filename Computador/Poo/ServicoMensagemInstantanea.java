package Computador.Poo;

public class ServicoMensagemInstantanea {

  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando Mensagem "); // Adicionado o ponto e vírgula
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    validarConectadoInternet();
    System.out.println("Recebendo Mensagem ");
  }

  public void salvarHistoricoMensagem() {
    validarConectadoInternet();
    System.out.println("Salvando Mensagem ");
  }

  // Adicionando o método de validação para evitar erros de compilação
  public void validarConectadoInternet() {
    System.out.println("Validando conexão à Internet...");
  }

}