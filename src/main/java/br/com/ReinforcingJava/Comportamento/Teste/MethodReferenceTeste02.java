package br.com.ReinforcingJava.Comportamento.Teste;

import br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio.Anime;
import br.com.ReinforcingJava.Comportamento.LambdasTeste.service.AnimeComparator;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTeste02 {

    public static void main(String[] args) {
        AnimeComparator animeComparator = new AnimeComparator();
       List<Anime> animes = new ArrayList<>(List.of(new Anime("One Piece",1070),new Anime("Boruto",350)));
        animes.sort(animeComparator::compareByEpisodesNonStatic);
        System.out.println(animes);
    }
}
