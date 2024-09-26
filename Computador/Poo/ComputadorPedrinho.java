package Computador.Poo;

import Computador.FacebookMesseger;
import Computador.MSNMessengerr;
import Computador.Telegram;

public class ComputadorPedrinho {
  public static void main(String[] args) {

    MSNMessengerr msn = new MSNMessengerr();

    msn.enviarMensagem();
    msn.receberMensagem();

    System.out.println("FACEBOOK");

    FacebookMesseger fb = new FacebookMesseger();
    fb.enviarMensagem();

    System.out.println("TELEGRAM");

    Telegram tlg = new Telegram();
    tlg.enviarMensagem();
    tlg.receberMensagem();

  }

}
