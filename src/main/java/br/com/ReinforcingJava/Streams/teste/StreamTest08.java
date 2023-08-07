package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels =
            List.of(
                    new LightNovel("Tensei Shitta",8.99),
                    new LightNovel("Overlord",6.49),
                    new LightNovel("Violet Evergarden",3.67),
                    new LightNovel("No Game No Life",2.97),
                    new LightNovel("FullMetalAlchemist",9.54),
                    new LightNovel("Kumo Desuga",1.45),
                    new LightNovel("Monogatari",3.45),
                    new LightNovel("Monogatari",3.45)
            );

    public static void main(String[] args) {

        lightNovels.stream()
                .map(LightNovel::getPreco)
                .filter(preco -> preco > 3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);


        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPreco)
                .filter(preco -> preco > 3)
                .sum();

        System.out.println(sum);
    }
}
