package br.com.ReinforcingJava.Comportamento.LambdasTeste;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerLambdaTeste01 {
    public static void main(String[] args) {

      List<String> list = List.of("Lucas","Aline","Bob","Bacon","Baby");
        foreEach(list,(String s) -> System.out.println(s));

    }
    private static <T> void foreEach(List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }

    }
}
