package br.com.TesteDsin.questao03;

import java.util.Scanner;

public class CalculaCarro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // entrada do valor de fabrica do carro!!!
        System.out.println("Digite o valor do carro: ");
        double valorCarroFabrica = input.nextDouble();

        // variaves
        double valorDistribuidor =  valorCarroFabrica * 0.125;
        double valorImposto = valorCarroFabrica * 0.33;
        double totalCarro = valorCarroFabrica + valorDistribuidor + valorImposto;
        double valorDesconto = totalCarro * 0.05;
        double carroComDesconto = totalCarro - valorDesconto;

        // saida do console
        System.out.println("Valor do Distribuidor : " + valorDistribuidor);
        System.out.println("Valor do imposto: " + valorImposto);
        System.out.println("Valor do Carro: " + totalCarro);
        System.out.println("Valor do desconto " + valorDesconto);
        System.out.println("Valor do carro com desconto : " + carroComDesconto);



    }
}
