package br.com.BoraJava.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        /*
        \d = todos os digitos
        \D = tudo que não e digito
        \s = espaços em branco \t \n \f \r
        \S = tofos caracteres excluindo os em branco
        \w = a-ZA-Z, digitos
        \W = tudo o que não for incluso no \w
        [] = recebe a regex entre ""
        ? = zero ou uma
        * = zero ou mais
        + uma ou mais
        {n,m} de n até m
        () = agrupador
        | = ou --- o(v|c)o = ovo,oco]
        $ = final da linha
        = . ponto = 1.3 = 123,133,1@3, 1A3
        \\ = caracter de escape
        */

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "lucas@hotmail.com, 159aln@yahoo.com.br, #@!jail@mail.com, asheley@mail.com";

        System.out.println("#@!jail@mail.com".matches(regex));

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
