package Lacos_de_repeticao;

public class ExemploWhile {

    public static void main(String[] args) {
        double mesada = 50.0;
        double valorDoce = 5.0; // Inicializando o valor do doce

        while (mesada > 0) {
            if (valorDoce > mesada) {
                valorDoce = mesada; // Se o valor do doce for maior que a mesada restante
            }

            System.out.println("Doce do valor: " + valorDoce + " adicionando no carrinho");
            mesada = mesada - valorDoce;
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda sua mesada em doces");
    }
}
