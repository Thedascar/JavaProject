package br.com.Deitel.cap4;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String op = "";
        double totalKm = 0;
        double totalLitros = 0;
        while (op != "sair") {
            System.out.println("Quantos Km's: ");
            double km = s.nextDouble();
            System.out.println("Quantos litros gastos: ");
            double litros = s.nextDouble();

            double res = km / litros;

            System.out.println(res);
            s.nextLine();

            System.out.println("Digite sair, para sair !!!!! ");
            op = s.nextLine();
            if(op.equals("sair")){
                break;
            }else{
                totalKm += km;
                totalLitros += litros;

            }
        }
        double totalMedia = totalKm/totalLitros;
        System.out.println("totalkm: " + totalKm);
        System.out.println("totalLitros: " + totalLitros);
        System.out.println("totalMedia: " + totalMedia);

    }
}