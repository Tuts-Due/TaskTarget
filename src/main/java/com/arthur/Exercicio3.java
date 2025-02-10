package com.arthur;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Exercicio3 {
    public static void executar() {
        double[] faturamento = carregarFaturamentoJson("faturamento.json");

        if (faturamento == null || faturamento.length == 0) {
            System.out.println("Erro ao carregar faturamento.");
            return;
        }

        // Filtrando dias sem faturamento (0)
        double menor = Arrays.stream(faturamento).filter(v -> v > 0).min().orElse(0);
        double maior = Arrays.stream(faturamento).max().orElse(0);
        double media = Arrays.stream(faturamento).filter(v -> v > 0).average().orElse(0);
        long diasAcimaMedia = Arrays.stream(faturamento).filter(v -> v > media).count();

        System.out.println("Menor faturamento: R$" + menor);
        System.out.println("Maior faturamento: R$" + maior);
        System.out.println("Dias com faturamento acima da média: " + diasAcimaMedia);
    }

    private static double[] carregarFaturamentoJson(String caminho) {
        try (Reader reader = new InputStreamReader(
                Exercicio3.class.getClassLoader().getResourceAsStream(caminho), StandardCharsets.UTF_8)) {

            if (reader == null) {
                System.err.println("Arquivo JSON não encontrado: " + caminho);
                return null;
            }

            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            Gson gson = new Gson();
            return gson.fromJson(jsonObject.getAsJsonArray("faturamento"), double[].class);
        } catch (Exception e) {
            System.err.println("Erro ao ler o arquivo JSON: " + e.getMessage());
            return null;
        }
    }
}
