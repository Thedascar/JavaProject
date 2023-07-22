package br.com.BaseJava.Lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Giu","Ana","Sus","Lia","Gui");

        System.out.println("Tadicional");
        for (String nome: aprovados) {
            System.out.println(nome);
        }

        System.out.println("Lambda");
        aprovados.forEach((nome) -> {System.out.println(nome + "!!!!!!");});


        System.out.println("Method Reference..");
        aprovados.forEach(System.out::println);

        System.out.println("Lambda 2222222222");
        aprovados.forEach((nome) -> meuImprimir(nome));

        System.out.println("Method Reference 22222..");
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("Oi meu nome é " + nome);
    }
}
