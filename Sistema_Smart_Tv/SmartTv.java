package Sistema_Smart_Tv;

public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void aumentarVolume() {
    volume = volume + 1;
    // volume = volume + 1;
    System.out.println("Aumentando o volume para:" + volume);
    volume++;
  }

  public void diminuirVolume() {
    // volume = volume + 1;
    System.out.println("Diminuindoo volume para:" + volume);
    volume--;
  }

  public void aumentarCanal() {
    canal++;
  }

  public void diminuirCanal() {
    canal--;
  }

  public void mudarCanal(int novoCanal) {
    canal = novoCanal;
  }

  public void ligar() {
    ligada = true;
  }

  public void desligar() {
    ligada = false;
  }

}
