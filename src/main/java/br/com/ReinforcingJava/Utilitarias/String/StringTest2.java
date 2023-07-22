package br.com.ReinforcingJava.Utilitarias.String;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "    Lucas";
        String nome2 = "Ramon";
        System.out.println(nome.charAt(4));
        System.out.println(nome.length());
        System.out.println(nome.replace("c","z"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome2.substring(3));
        System.out.println(nome2.substring(2,4));
        System.out.println(nome.trim());
    }
}
