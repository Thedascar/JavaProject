package br.com.fundamentosjava.Lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBianarioEBiFunction {
    public static void main(String[] args) {


        BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(10.45,8.47));

        BiFunction<Double,Double,String> res = (n1, n2) -> (n1 + n2) / 2 >= 7 ? "Aprovado": "Reprovado;";

        System.out.println(res.apply(8.9,7.5));

        Function<Double,String> comp = o -> o >= 7 ? "Aprovado": "Reprovado";


        System.out.println(media.andThen(comp).apply(5.7,6.3));
    }
}
