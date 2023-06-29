package br.com.TesteDsin.questao01;


import java.util.Scanner;

public class CalculaSalarioLiquido {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nomeFunc = input.nextLine();

        System.out.println("Digite o preço da sua hora trabalhada: ");
        double valorHora = input.nextDouble();

        System.out.println("Digite seus dias trabalhados: ");

        int diasTrabalhados = input.nextInt();
        var trabalhador = new Trabalhador(nomeFunc,valorHora,diasTrabalhados);
        trabalhador.imprimeRelatorio();
    }
}
