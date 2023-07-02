package br.com.Deitel.cap2.exercicios;

public class Exercicio14 {
    public static void main(String[] args) {


        double kmTotalDia = 25;
        double precoLitroGasolina = 5.5;
        double kmMedioPorLitro = 8.0;
        double taxaEstacioanmento = 4.50;
        double pedagioDia = 12.50;

        double mediaCarro = precoLitroGasolina / kmMedioPorLitro;
        double custoTotalPorLitro = mediaCarro * kmTotalDia;

        double total = custoTotalPorLitro + taxaEstacioanmento + pedagioDia;


        System.out.println("Seu custo total do dia será de: " + total);



    }
}