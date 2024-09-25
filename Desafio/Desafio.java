package Desafio;

import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lê os valores da entrada
    Scanner leitorDeEntradas = new Scanner(System.in);
    float valorSalario = leitorDeEntradas.nextFloat();
    float valorBeneficios = leitorDeEntradas.nextFloat();

    float valorImposto = 0;

    // Calcula o imposto de acordo com a faixa salarial
    if (valorSalario >= 0 && valorSalario <= 1100) {
      valorImposto = 0.05F * valorSalario; // 5% de imposto
    } else if (valorSalario > 1100 && valorSalario <= 2500) {
      valorImposto = 0.10F * valorSalario; // 10% de imposto
    } else if (valorSalario > 2500) {
      valorImposto = 0.15F * valorSalario; // 15% de imposto
    }

    // Cálculo correto: subtrai o imposto do salário e adiciona os benefícios
    float saida = valorSalario - valorImposto + valorBeneficios;

    // Imprime o resultado com duas casas decimais
    System.out.println(String.format("%.2f", saida));
  }
}
