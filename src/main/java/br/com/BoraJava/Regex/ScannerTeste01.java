package br.com.BoraJava.Regex;

public class ScannerTeste01 {
    public static void main(String[] args) {
        String text = "Vi;Rengar;Jaz";
        String[] nomes = text.split(";");
        for (String nome : nomes) {
            System.out.println(nome.trim());
        }

    }

}
