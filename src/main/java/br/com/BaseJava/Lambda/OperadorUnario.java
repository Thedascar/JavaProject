package br.com.BaseJava.Lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = num -> num + 2;
        UnaryOperator<Integer> vezesDois = num -> num * 2;
        UnaryOperator<Integer> menosDois = num -> num - 2;

        System.out.println(maisDois.andThen(vezesDois).andThen(menosDois).apply(0));
    }
}
