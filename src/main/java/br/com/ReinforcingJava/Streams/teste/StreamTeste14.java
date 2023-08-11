package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.Category;
import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTeste14 {
    private static List<LightNovel> lightNovels =
            new ArrayList<>(List.of(
                    new LightNovel("Tensei Shitta",8.99, Category.FANTASIA),
                    new LightNovel("Overlord",6.49,Category.FANTASIA),
                    new LightNovel("Violet Evergarden",3.67,Category.DRAMA),
                    new LightNovel("No Game No Life",2.97,Category.FANTASIA),
                    new LightNovel("FullMetalAlchemist",9.54,Category.FANTASIA),
                    new LightNovel("Kumo Desuga",1.45,Category.FANTASIA),
                    new LightNovel("Monogatari",3.45,Category.ROMANCE)
            ));
    public static void main(String[] args) {

        Map<Category, Long> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()
        ));
        System.out.println(collect);


        Map<Category, Optional<LightNovel>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.maxBy(Comparator.comparing(LightNovel::getPreco))));
        System.out.println(collect1);


        Map<Category, LightNovel> collect3 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPreco)), Optional::get)));
        System.out.println(collect3);

    }
}
