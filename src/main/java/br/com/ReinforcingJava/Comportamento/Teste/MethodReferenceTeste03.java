package br.com.ReinforcingJava.Comportamento.Teste;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;


public class MethodReferenceTeste03 {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(List.of("Lucas", "Aline", "Dogs"));
        lista.sort(String::compareTo);
        System.out.println(lista);

        Function<String,Integer> numStringToInteger = Integer::parseInt;
        System.out.println(numStringToInteger.apply("8"));

        BiPredicate<List<String>,String> checkName = List::contains;
        System.out.println(checkName.test(lista,"Dogs"));
    }
}
