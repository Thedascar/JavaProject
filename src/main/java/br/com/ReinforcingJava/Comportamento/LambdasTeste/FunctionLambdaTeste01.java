package br.com.ReinforcingJava.Comportamento.LambdasTeste;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionLambdaTeste01 {
    public static void main(String[] args) {
        List<String> list = List.of("Lucas","Aline");
        List<Integer> lista = map(list, String::length);
        System.out.println(lista);

    }

    private static  <T,R> List<R> map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T t : list) {
            R r = function.apply(t);
            result.add(r);
        }
        return result;
    }
}
