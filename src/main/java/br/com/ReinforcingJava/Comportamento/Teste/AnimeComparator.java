package br.com.ReinforcingJava.Comportamento.Teste;

import br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio.Anime;

public class AnimeComparator {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitulo().compareTo(a2.getTitulo());
    }
}
