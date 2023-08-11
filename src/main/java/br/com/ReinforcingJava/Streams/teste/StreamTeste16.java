package br.com.ReinforcingJava.Streams.teste;


import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTeste16 {

    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());

        long num = 10_000_000;
        sumFor(num);
        sumStreamInterate(num);
    }

    private static void sumFor(long num){
        System.out.println("sum");
        long res = 0;
        long init = System.currentTimeMillis();
        for (long i = 0; i < num; i++) {
            res += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(res+ " " + (end - init)+ "ms");

    }

    private static void sumStreamInterate(long num){
        System.out.println("sumStreamInterate");
        long res = 0;
        long init = System.currentTimeMillis();
        res = LongStream.rangeClosed(1L,num).parallel().reduce(0L,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(res+ " " + (end - init)+ "ms");
    }

}
