package br.com.ReinforcingJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //String regex = "[a-zA-Z]";
        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x110G 0x1";

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
