package br.com.ReinforcingJava.Streams.teste;

import br.com.ReinforcingJava.Streams.dominio.Category;
import br.com.ReinforcingJava.Streams.dominio.LightNovel;
import br.com.ReinforcingJava.Streams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTeste13 {
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

        Map<Promotion, List<LightNovel>> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(l -> l.getPreco() < 5 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
                ));
        System.out.println(collect);

        Map<Category, Map<Promotion, List<LightNovel>>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.groupingBy(l -> l.getPreco() < 5 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);
    }
}
