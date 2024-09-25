package Desafio.Escola;

import Desafio.Escola.Aluno;

public class Escola {
  public static void main(String[] args) {
    Aluno felipe = new Aluno();

    // Atribuindo valores
    felipe.nome = "Felipe";
    felipe.idade = 8;

    // Exibindo as informações
    System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos.");
  }
}