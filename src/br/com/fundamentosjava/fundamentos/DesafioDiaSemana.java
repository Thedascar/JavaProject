package br.com.fundamentosjava.fundamentos;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {
        // domingo é 1
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String dia = s.nextLine();

        if(dia.equalsIgnoreCase("segunda")){
            System.out.println("O dia é " + dia + " seu número é : 2");
        } else if (dia.equalsIgnoreCase("terça")) {
            System.out.println("O dia é " + dia + " seu número é : 3");
        }else if (dia.equalsIgnoreCase("quarta")) {
            System.out.println("O dia é " + dia + " seu número é : 4");
        }else if (dia.equalsIgnoreCase("quinta")) {
            System.out.println("O dia é " + dia + " seu número é : 5");
        }else if (dia.equalsIgnoreCase("sexta")) {
            System.out.println("O dia é " + dia + " seu número é : 6");
        }else if (dia.equalsIgnoreCase("sabádo")) {
            System.out.println("O dia é " + dia + " seu número é : 7");
        } else if (dia.equalsIgnoreCase("domingo")) {
            System.out.println("O dia é " + dia + " seu número é : 1");
        }else{
            System.out.println("valores inválidos");
        }
        s.close();
    }
}
