package br.com.fundamentosjava.Collections.Lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

        List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Lucas");
        lista.add(u1);
        lista.add(new Usuario("Aline"));
        lista.add(new Usuario("Bacon"));
        lista.add(new Usuario("Bob"));

        System.out.println("aa" + lista.get(2));

        for (Usuario listas :
             lista
             ) {
            System.out.println(listas);
        }

        lista.remove(1);
        lista.remove(new Usuario("Lucas"));

        System.out.println(lista);

        System.out.println(lista.contains("Bob"));
    }
}
