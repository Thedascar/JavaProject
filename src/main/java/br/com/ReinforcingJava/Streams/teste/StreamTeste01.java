package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.LightNovel;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTeste01 {
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

        List<String> collect = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getNome))
                .filter(e -> e.getPreco() <= 4)
                .limit(3)
                .map(LightNovel::getNome)
                .collect(Collectors.toList());

        System.out.println(collect);

    }
}

