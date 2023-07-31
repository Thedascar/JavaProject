package br.com.ReinforcingJava.Comportamento.Teste;

import br.com.ReinforcingJava.Comportamento.LambdasTeste.dominio.Anime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTeste01 {

    public static void main(String[] args) {
        List<Anime> anime = new ArrayList<>(List.of(new Anime("One piece", 1070), new Anime("Jujustsu", 250), new Anime("Naruto", 520)));
        Collections.sort(anime,AnimeComparator::compareByTitle);
        System.out.println(anime);
    }
}
