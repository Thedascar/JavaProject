package br.com.ReinforcingJava.Streams.teste;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {

        IntStream.rangeClosed(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println();
        IntStream.range(1,50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n+ " "));


        System.out.println();
        Stream.of("Lucas", "ALine", "a", "Baby")
                .map(String::toUpperCase)
                .forEach(System.out::println);


        int num[] = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);



    }
}
