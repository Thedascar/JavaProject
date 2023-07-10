package br.com.BoraJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {
        String regex = "\\D";
        String texto = "asf15126156adf1asdf51s65d1f62sd1f";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("texto:   "+ texto);
        System.out.println("regex "+ regex);
        System.out.println("Posicoes econtradas");
        while(matcher.find()){
            System.out.println(matcher.start()+" "+matcher.group());
        }
    }
}
