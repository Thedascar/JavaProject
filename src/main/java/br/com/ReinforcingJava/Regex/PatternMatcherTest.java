package br.com.ReinforcingJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "ababalalabala";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   "+ texto);
        System.out.println("indice: 0123456789");
        System.out.println("regex "+ regex);
        System.out.println("Posicoes econtradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" ");
        }
    }
}
