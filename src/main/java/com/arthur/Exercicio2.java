package com.arthur;

import java.util.Scanner;

public class Exercicio2 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int n) {
        int a = 0, b = 1, c = 0;
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
        }
        return c == n;
    }
}
