package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));


        lightNovels.stream().max(Comparator.comparing(LightNovel::getPreco)).ifPresent(System.out::println);
        lightNovels.stream().collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPreco))).ifPresent(System.out::println);

        double sum = lightNovels.stream()
                .mapToDouble(LightNovel::getPreco).sum();
        System.out.println(sum);


        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPreco)));

        System.out.println(lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPreco)));


        String collect = lightNovels.stream().map(LightNovel::getNome)
                .collect(Collectors.joining(" , "));
        System.out.println(collect);
    }
}
