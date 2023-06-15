package br.com.fundamentosjava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class criandoStreams {
    public static void main(String[] args) {

        System.out.println("Método Stream normal");
        Stream<String> linguagem = Stream.of("Java","C#","C++");
        linguagem.forEach(System.out::println);

        System.out.println("Médotodo direto do Array");

        String[] linguagem2 = {"Go","Js","Ruby","Php"};
        Arrays.stream(linguagem2,0,2).forEach(System.out::println);

        System.out.println("Método Parallel, apartir de uam lista");

        List<String> linguagem3 = Arrays.asList("Python","Kotlin","Swift");
        linguagem3.stream().forEach(System.out::println);
        System.out.println("Com parallel");
        linguagem3.parallelStream().forEach(System.out::println);

        System.out.println("Método infinido para desmotração de Lambda");
        //Stream.iterate(0,n -> n + 1).forEach(System.out::println);
    }
}
