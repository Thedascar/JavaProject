package br.com.fundamentosjava.Generics.ComGenerics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {
    public static void main(String[] args) {

        List<String> langs = Arrays.asList("Java", "C#", "JS", "PHP");
        List<Integer> num = Arrays.asList(10,20,5,8);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimaLinguagem2 = (Integer) ListaUtil.getUltimo1(num);
        System.out.println(ultimaLinguagem2);


        String ultimaLinguagem3 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem3 + " Generics");

        Integer ultimaLinguagem4 = ListaUtil.getUltimo2(num);
        System.out.println(ultimaLinguagem4 + " Generics");
    }
}