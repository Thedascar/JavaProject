package br.com.ReinforcingJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        /*
        \d = todos os digitos
        \D = tudo que não e digito
        \s = espaços em branco \t \n \f \r
        \S = tofos caracteres excluindo os em branco
        \w = a-ZA-Z, digitos
        \W = tudo o que não for incluso no \w
        []
        ? = zero ou uma
        * = zero ou mais
        + uma ou mais
        {n,m} de n até m
        ()
        | = ou --- o(v|c)o = ovo,oco]
        $ = final da linha
        = . ponto = 1.3 = 123,133,1@3, 1A3
        */

        String regex = "0[xX][0-9a-fA-F]+(\\s|$)";
        String texto = "12 0x 0X 0xFFABC 0x10G 0x1";

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
