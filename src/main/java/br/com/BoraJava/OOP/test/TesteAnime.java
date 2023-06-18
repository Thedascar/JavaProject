package br.com.BoraJava.OOP.test;

import br.com.BoraJava.OOP.domain.Anime;

public class TesteAnime {
    public static void main(String[] args) {

        Anime b = new Anime();
        b.printer();
        System.out.println("------");
        Anime a = new Anime("dbz", "tv", "pt", new int[100]);
        a.printer();


    }
}
