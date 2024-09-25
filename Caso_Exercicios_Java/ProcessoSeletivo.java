package Caso_Exercicios_Java;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoCandidatos();
    imprimirSelecionados();
  }

  // método auxiliar
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  static void entrandoEmContato(String candidato) {
    int tentativaRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    while (continuarTentando && tentativaRealizadas <= 3) {
      atendeu = atender(); // Tentativa de contato

      if (atendeu) {
        System.out.println("CONTATO REALIZADO COM SUCESSO");
        continuarTentando = false; // Para de tentar se o candidato atender
      } else {
        tentativaRealizadas++; // Incrementa o número de tentativas
        if (tentativaRealizadas > 3) {
          System.out.println("Número máximo de tentativas atingido.");
        }
      }
    }
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "Felipe", "Thiago", "Beatriz", "Julia", "Heloise" };

    System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("O candidato de n° " + indice + " é " + candidatos[indice]);
    }

    System.out.println("Forma abreviada de interação for each");

    for (String candidato : candidatos) {
      System.out.println("O candidato selecionado foi " + candidato);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "Felipe", "Thiago", "Beatriz", "Julia", "Heloise", "João", "Pedro" };

    int canditadosSelecionados = 0;
    int candidatosAtual = 0;
    Double salarioBase = 2000.00;

    while (canditadosSelecionados < 5 && candidatosAtual < candidatos.length) {
      String canditado = candidatos[candidatosAtual];
      Double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + canditado + " solicitou este valor de salario " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + canditado + " foi selecionado para a vaga ");
        canditadosSelecionados++;
        entrandoEmContato(canditado); // Tentando entrar em contato com o candidato selecionado
      }
      candidatosAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    Double salarioBase = 3000.00;

    if (salarioBase > salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO!");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
    } else {
      System.out.println("Aguardando resultado de demais canditados");
    }
  }
}
