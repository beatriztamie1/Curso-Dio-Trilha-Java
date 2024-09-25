package Poo;

public abstract class Veiculo { // A classe deve ser abstrata
  private String chassi;

  public String getChassi() {
    return chassi;
  }

  public void setChassi(String chassi) {
    this.chassi = chassi;
  }

  public abstract void ligar(); // Método abstrato

}