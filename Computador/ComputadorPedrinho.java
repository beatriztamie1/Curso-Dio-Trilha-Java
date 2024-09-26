package Computador;

public class ComputadorPedrinho {
  public static void main(String[] args) {

    MSNMessengerr msn = new MSNMessengerr();

    msn.enviarMensagem();
    msn.receberMensagem();

    FacebookMesseger fb = new FacebookMesseger();
    fb.enviarMensagem();

    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();

  }
}