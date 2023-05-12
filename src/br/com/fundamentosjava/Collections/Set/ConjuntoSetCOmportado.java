package br.com.fundamentosjava.Collections.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoSetCOmportado {
    public static void main(String[] args) {

        TreeSet<String> listaAprovados = new TreeSet<>();



        for (String candidato : listaAprovados
             ) {
            System.out.println(candidato);
        }

        Set<Integer> listaAprovados2 = new HashSet<>();
        listaAprovados2.add(1);
        listaAprovados2.add(10);
        listaAprovados2.add(55);
        listaAprovados2.add(0);
        listaAprovados2.add(58794);

        for (int n :
             listaAprovados2) {
            System.out.println(n);
        }
    }
}
