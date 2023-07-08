package br.com.Deitel.cap4;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int limiteAutorizadoDoMes = 1500;

        System.out.println("Qual número da sua conta: ");
        String numeroDaConta = s.nextLine();

        System.out.println("Qual seu saldo inicial: ");
        int saldoInicioMês = s.nextInt();

        System.out.println("Quanto gastou: ");
        int totalDeGastos = s.nextInt();

        System.out.println("Total da divida de crédito: ");
        int totalDeCreditosAplicados = s.nextInt();


        int novoSaldo = limiteAutorizadoDoMes - (saldoInicioMês + totalDeGastos + totalDeCreditosAplicados) ;

        System.out.println("Número da conta: " + numeroDaConta);
        System.out.println("Limite autorizado: " + limiteAutorizadoDoMes);
        if(novoSaldo > 0){
            System.out.println("Limite restante: " + novoSaldo);
        }else{
            System.out.println("Cara pare de gastar, começou a usar cheque especial " + novoSaldo);
        }

    }
}