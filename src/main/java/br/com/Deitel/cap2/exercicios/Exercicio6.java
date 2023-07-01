package br.com.Deitel.cap2.exercicios;

public class Exercicio6 {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int sum = a + b;
        int prod = a * b;
        int rest = a % b;
        int average = sum / 2;

        if(a == b){
            System.out.println("a and b are equal");
        } else if (b > a) {
            System.out.println("b is larger");
        }else{
            System.out.println("a is larger");

        }

        System.out.println("Average: " + average);
        System.out.println("Sum:  "+ sum);
        System.out.println("Prod: " + prod);
        System.out.println("Rest: " + rest);


    }
}
