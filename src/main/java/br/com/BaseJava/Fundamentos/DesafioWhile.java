package br.com.BaseJava.Fundamentos;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Digite a palavra sair: ");
        String digaSair = "";

        while(!digaSair.equalsIgnoreCase("sair")){
            System.out.println(digaSair);
            digaSair = s.nextLine();
        }
        s.close();
        System.out.println("Good Bye");
    }
}
