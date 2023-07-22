package br.com.BaseJava.Lambda;

import java.util.function.BinaryOperator;

public class TesteCalculo3 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = (x, y) -> {
            return x + y;
        };

        System.out.println(calc.apply(10.45, 13.45));

        calc = (x, y) -> x * y;

        System.out.println(calc.apply(2.0, 3.0));
    }
}