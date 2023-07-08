package br.com.BoraJava.Wrappers;

import java.util.*;

public class WrappersTest01 {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();

        lista.add("Lucas");
        lista.add("Bacon");
        lista.add("Bob");
        lista.remove(1);

        System.out.println(lista);
    }
}
