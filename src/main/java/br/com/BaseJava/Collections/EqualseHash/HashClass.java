package br.com.BaseJava.Collections.EqualseHash;

import java.util.HashSet;

public class HashClass {
    public static void main(String[] args) {
        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Lucas"));
        usuarios.add(new Usuario("Aline"));
        usuarios.add(new Usuario("BobBacon"));

        System.out.println(usuarios.contains(new Usuario("Lucas")));
    }
}
