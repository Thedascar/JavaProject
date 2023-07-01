package br.com.Deitel.cap2.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Soma de 3 produtos inteiros");

        System.out.println("Digite um valor inteiro: ");
        int x = s.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int y = s.nextInt();
        System.out.println("Digite um valor inteiro: ");
        int z = s.nextInt();

        int result = x * y * z;

        System.out.printf("The product is: %d", result);
    }
}
