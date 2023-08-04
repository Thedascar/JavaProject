package br.com.ReinforcingJava.Comportamento.LambdasTeste.service;

import br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio.Anime;

import java.util.Comparator;

public class AnimeComparator implements Comparator<Anime> {

    public int compareByEpisodesNonStatic(Anime a, Anime b){
        return Integer.compare(a.getEpisodios(),b.getEpisodios());

    }

    @Override
    public int compare(Anime o1, Anime o2) {
        return 0;
    }
}
