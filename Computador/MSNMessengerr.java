package Computador;

public class MSNMessengerr { // Nome da classe alterado para coincidir
  public void enviarMensagem() {
    validarConectadoInternet();
    System.out.println("Enviando Mensagem");
    salvarHistoricoMensagem();
  }

  public void receberMensagem() {
    System.out.println("Recebendo Mensagem");
  }

  private void validarConectadoInternet() {
    System.out.println("Validando se está conectado à Internet");
  }

  private void salvarHistoricoMensagem() {
    System.out.println("Salvando o histórico de mensagens");
  }
}