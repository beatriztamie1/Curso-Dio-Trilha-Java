package Enum;

//enum
public enum EstadosBrasileiros {

  SAO_PAULO("SP", "São Paulo", 11),
  RIO_JANEIRO("RJ", "Rio de Janeiro", 12),
  PIAUI("PI", "Piauí", 13),
  CEARA("CE", "Ceará", 14),
  MARANHAO("MA", "Maranhão", 15);

  private String nome;
  private String sigla;
  private int ibge;

  // Construtor do enum
  private EstadosBrasileiros(String sigla, String nome, int ibge) {
    this.sigla = sigla;
    this.nome = nome;
    this.ibge = ibge;
  }

  // Retorna o código IBGE do estado
  public int getIbge() {
    return ibge;
  }

  // Retorna a sigla do estado
  public String getSigla() {
    return sigla;
  }

  // Retorna o nome do estado
  public String getNome() {
    return nome;
  }

  // Retorna o nome do estado em maiúsculo
  public String getMaiusculo() {
    return nome.toUpperCase();
  }
}
