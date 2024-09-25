package Sistema_Conta_Banco; // Alterado para usar underscores

import java.util.Scanner; // Importação da classe Scanner

public class ContaBancoo {
  public static void main(String[] args) {

    // Inicializa o Scanner para capturar a entrada do usuário
    Scanner scanner = new Scanner(System.in);

    // Variáveis iniciais
    int Numero = 1021;
    String Agencia = "067-8";
    String NomeCliente = "Mario Andrade";
    double Saldo = 237.48;

    // Solicita que o usuário digite o número da Agência
    System.out.println("Por favor, digite o número da Agência:");
    Agencia = scanner.nextLine(); // Usa nextLine() para capturar toda a linha digitada

    System.out.println("Digite o Numero da conta:");
    Numero = Integer.parseInt(scanner.nextLine());
    ; // Converte a entrada para int

    System.out.println("Confirme o nome do cliente:");
    NomeCliente = scanner.nextLine();

    System.out.println("Insira o saldo desejado");
    Saldo = Double.parseDouble(scanner.nextLine());

    System.out.println("Nome do cliente confirmado, obrigado " + NomeCliente);
    System.out.println("Seu saldo é de: " + Saldo);
    System.out.println("Numero da conta atualizado: " + Numero);
    System.out.println("Número da Agência atualizado: " + Agencia);
    System.out.println("Ola " + NomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + Agencia
        + " conta " + Numero + " e seu Saldo " + Saldo + " Já esta disponível para saque. ");

    // Fechar o scanner após o uso
    scanner.close();
  }

}
