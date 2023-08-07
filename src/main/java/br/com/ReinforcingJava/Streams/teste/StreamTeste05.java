package br.com.ReinforcingJava.Streams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTeste05 {
    public static void main(String[] args) {
        List<String> lista = List.of("Lucas", "Aline", "Ramon");

        List<String> collect = lista.stream()
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
