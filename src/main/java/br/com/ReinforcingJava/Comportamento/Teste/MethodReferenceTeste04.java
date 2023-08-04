




import br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio.Anime;
import br.com.ReinforcingJava.Comportamento.LambdasTeste.service.AnimeComparator;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;


public class MethodReferenceTeste04 {

    public static void main(String[] args) {

        Supplier<AnimeComparator> newAnimeCOmparators = () -> new AnimeComparator();
        AnimeComparator animeComparator =  newAnimeCOmparators.get();
        List<String> lista = new ArrayList<>(List.of("Lucas", "Aline", "Dogs"));


        BiFunction<String,Integer,Anime> animeBi = (s,i) -> new Anime("A",50);
        BiFunction<String,Integer,Anime> animeBi2 = Anime::new;
        System.out.println(animeBi2.apply("aaaa",50));
     }
}
