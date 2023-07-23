package br.com.ReinforcingJava.Collections.collections;


import java.util.ArrayList;
import java.util.List;

public class ListTeste01 {
    public static void main(String[] args) {
        List<String> nome = new ArrayList<>();
        nome.add("Lucas");
        nome.add("Ramon");


        for (String n: nome){
            System.out.println(n);
        }

        System.out.println("-----------------");
        nome.add("bacon");
        for (int i = 0; i < nome.size(); i++) {
            System.out.println(nome.get(i));
            }
        System.out.println("--------------");

        List<Integer> numero = new ArrayList<>();
        List<Integer> numero2 = new ArrayList<>();
        numero.add(50);
        numero.add(100);
        numero.add(100);
        numero.add(100);
        numero.add(100);
        numero.add(100);
        numero.add(100);


        for (Integer n: numero){
            System.out.println(n);
        }

        System.out.println("-----------------");
        numero.add(18);
        for (int i = 0; i < numero.size(); i++) {
            System.out.println(numero.get(i));
        }
        numero.remove(7);
        numero.addAll(numero2);

        System.out.println(numero);

    }
}
