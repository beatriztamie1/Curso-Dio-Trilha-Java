package Poo;

public class Autodromo {
  public static void main(String[] args) {
    Carro jeep = new Carro();
    jeep.setChassi("563632");
    jeep.ligar(); // Chama o método ligar para o carro

    Moto z400 = new Moto();
    z400.setChassi("52356");
    // z400.ligar(); // Agora liga a moto

    Veiculo coringa = z400;
    coringa.ligar();
  }
}