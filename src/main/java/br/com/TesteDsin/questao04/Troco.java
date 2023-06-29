package br.com.TesteDsin.questao04;

import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota100 = 0;
        int nota50 = 0;
        int nota20 = 0;
        int nota10 = 0;
        int nota5 = 0;
        int nota2 = 0;
        int nota1 = 0;


        System.out.println("Digite o valor desejado: ");
        int valor = input.nextInt();

       if (valor > 100){
           nota100 = valor / 100;
           valor -= nota100 * 100;
           System.out.println("notas de 100 = " + nota100);
       }if(valor >= 50){
           nota50 = valor / 50;
           valor -= nota50 * 50;
           System.out.println("notas de 50 = " + nota50);
       }if(valor >= 20){
            nota20 = valor / 20;
            valor -= nota20 * 20;
            System.out.println("notas de 20 = " + nota20);
        }if(valor >= 10){
            nota10 = valor / 10;
            valor -= nota10 * 10;
            System.out.println("notas de 10 = " + nota10);
        }if(valor >= 5){
            nota5 = valor / 5;
            valor -= nota5 * 5;
            System.out.println("notas de 5 = " + nota5);
        }if(valor >= 2){
            nota2 = valor / 2;
            valor -= nota2 * 2;

            System.out.println("notas de 2 = " + nota2);
        }if(valor >= 1){
            nota1 = valor / 1;
            valor -= nota50 * 1;
            System.out.println("notas de 1 = " + nota1);
        }
    }
}
