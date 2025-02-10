package com.arthur;

import java.util.Arrays;

public class Exercicio3 {
    public static void executar() {
        double[] faturamento = {1000.50, 2000.75, 0, 1500.30, 3000.90, 0, 0, 2200.10}; // Exemplo de faturamento

        double menor = Arrays.stream(faturamento).filter(v -> v > 0).min().orElse(0);
        double maior = Arrays.stream(faturamento).max().orElse(0);
        double media = Arrays.stream(faturamento).filter(v -> v > 0).average().orElse(0);
        long diasAcimaMedia = Arrays.stream(faturamento).filter(v -> v > media).count();

        System.out.println("Menor faturamento: R$" + menor);
        System.out.println("Maior faturamento: R$" + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }
}
