package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamTeste06 {
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

        System.out.println(lightNovels.stream().anyMatch(l -> l.getPreco() > 8));
        System.out.println(lightNovels.stream().allMatch(l -> l.getPreco() > 0));
        System.out.println(lightNovels.stream().noneMatch(l -> l.getPreco() < 8));

        lightNovels.stream().filter(l -> l.getPreco() > 3)
                .findAny()
                .ifPresent(System.out::println);

        lightNovels.stream().filter(l -> l.getPreco() > 2).min(Comparator.comparing(LightNovel::getPreco))
                .ifPresent(System.out::println);



    }
}
