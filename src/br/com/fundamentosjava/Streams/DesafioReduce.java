package br.com.fundamentosjava.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class DesafioReduce {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9);

        BinaryOperator<Integer> soma = (i, n) -> i + n;

        Optional<Integer> a = numeros.stream().reduce(soma);
        System.out.println(a);

        int b = numeros.stream().reduce(100,soma);
        System.out.println(b);

        numeros.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);


    }
}
