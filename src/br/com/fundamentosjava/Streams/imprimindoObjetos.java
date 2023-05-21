package br.com.fundamentosjava.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class imprimindoObjetos {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Lucas","Aline","Bacon","Bob");

        System.out.println("Método foreach");
        for (String ok:
             aprovados) {
            System.out.println(ok);
        }

        System.out.println("Método iterator..");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("Método Stream");
        Stream<String> stream = aprovados.stream();

        stream.forEach(System.out::println);

    }
}
