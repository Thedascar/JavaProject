package br.com.fundamentosjava.Fundamentos;

import java.util.Scanner;

public class MediaSalario {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Informe o salário: ");
        String renda1 = s.nextLine().replace(",",".");
        System.out.println("Informe o salário: ");
        String renda2 = s.nextLine().replace(",",".");
        System.out.println("Informe o salário: ");
        String renda3 = s.nextLine().replace(",",".");

        double media1 = Double.parseDouble(renda1);
        double media2 = Double.parseDouble(renda2);
        double media3 = Double.parseDouble(renda3);
        double total = (media1 + media2 + media3) / 3;
        System.out.println("A média foi de: " + total);


    }
}
