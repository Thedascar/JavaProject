package br.com.BoraJava.OOP.test;

import br.com.BoraJava.OOP.domain.Calc;

import java.util.Scanner;

public class testeCalc {
    public static void main(String[] args) {

        Calc res = new Calc();
        Scanner s = new Scanner(System.in);
        System.out.println("Write the 1st: ");
        double sum1 = s.nextDouble();
        res.setA(sum1);
        System.out.println("Write the 2st: ");
        double sum2 = s.nextDouble();
        res.setB(sum2);

        res.sum();
        System.out.println();

        double resSub = res.sub(10,2);
        System.out.println("The sub is : " + resSub);
    }
}
