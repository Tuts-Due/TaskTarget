package com.arthur;

public class Exercicio1 {
    public static void executar() {
        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        System.out.println("O valor da variável SOMA é: " + SOMA);
    }
}

