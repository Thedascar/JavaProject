package br.com.Deitel.cap2.exercicios;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Cálculo de folha de pagamento !!!!!!!");
        System.out.print("Enter an integer: ");
        int a = s.nextInt();

        System.out.print("Enter an integer: ");
        int b = s.nextInt();

        int c = a * b;

        System.out.println("the result is: " + c);
    }
}
