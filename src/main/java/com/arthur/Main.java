package com.arthur;

import com.arthur.Exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- MENU DE EXERCÍCIOS ---");
            System.out.println("1 - Soma com índice");
            System.out.println("2 - Verificar Fibonacci");
            System.out.println("3 - Analisar Faturamento Diário");
            System.out.println("4 - Percentual de Faturamento por Estado");
            System.out.println("5 - Inverter String");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    Exercicio1.executar();
                    break;
                case 2:
                    Exercicio2.executar();
                    break;
                case 3:
                    Exercicio3.executar();
                    break;
                case 4:
                    Exercicio4.executar();
                    break;
                case 5:
                    Exercicio5.executar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
