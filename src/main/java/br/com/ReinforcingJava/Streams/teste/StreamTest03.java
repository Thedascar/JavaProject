package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels =
            List.of(
                    new LightNovel("Tensei Shitta",8.99),
                    new LightNovel("Overlord",6.49),
                    new LightNovel("Violet Evergarden",3.67),
                    new LightNovel("No Game No Life",2.97),
                    new LightNovel("FullMetalAlchemist",9.54),
                    new LightNovel("Kumo Desuga",1.45),
                    new LightNovel("Monogatari",3.45)
            );
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.stream()
               .forEach(System.out::println);

        System.out.println("------------------------------");
        long count = stream.filter(e -> e.getPreco() > 4.0).count();
        long count2 = lightNovels.stream().distinct()
                .filter(e -> e.getPreco() > 4.0).count();
        System.out.println(count);
        System.out.println(count2);

    }
}
