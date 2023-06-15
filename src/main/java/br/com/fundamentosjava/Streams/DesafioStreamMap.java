package br.com.fundamentosjava.Streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioStreamMap {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        UnaryOperator<String> inverteBinario = d -> new StringBuilder(d).reverse().toString();
        Function<String,Integer> binarioParaInt = e -> Integer.parseInt(e,2);

        numbers.stream()
                .map(Integer::toBinaryString)
                .map(inverteBinario)
                .map(binarioParaInt)
                .forEach(System.out::println);
    }
}
