package br.com.fundamentosjava.fundamentos;

import java.util.Scanner;

public class SomaPar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int positivo = 0;
        int soma = 0;
        System.out.println("Digite um número positivo : ");
        positivo = s.nextInt();
        if(positivo > 0){
            soma += positivo;
        }
        while(positivo > 0){
            System.out.println("Digite um número positivo (-1 para sair): ");
            positivo = s.nextInt();
            if(positivo > 0){
                soma += positivo;
            }


        }
        System.out.println("A soma dos positivos é : " + soma);
    }
}
