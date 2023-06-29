package br.com.TesteDsin.questao02;

import java.util.Scanner;

public class RecebeValores {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor A: ");
        int a = input.nextInt();

        System.out.println("Digite o valor B: ");
        int b = input.nextInt();

        System.out.println("Digite o valor C: ");
        int c = input.nextInt();

        System.out.println("Digite o valor D: ");
        int d = input.nextInt();

        // exemplo de sequência que resulta positivo
        // 2 2 1 5
        if(c < 0 || d < 0 || a % 2 == 1  ){
            System.out.println("Valores não Aceitos");
        }else{
            if( b > c && d > a && c + d > a + b){
                System.out.println("Valores Aceitos");
            }
        }

    }
}


