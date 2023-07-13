package br.com.BoraJava.Regex;

import java.util.Scanner;

public class ScannerTeste02 {
    public static void main(String[] args) {
        String text = "Vi;Rengar;Jaz";

        Scanner s = new Scanner(text);
        s.useDelimiter(";");

        while(s.hasNext()){
            System.out.println(s.next());
        }

    }

}
