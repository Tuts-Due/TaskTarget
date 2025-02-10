package com.arthur;

import java.util.Scanner;

public class Exercicio5 {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0, fim = str.length() - 1;

        while (inicio < fim) {
            char temp = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = temp;
            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
