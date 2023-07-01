package br.com.Deitel.cap2.exercicios;

import java.util.Scanner;

public class Exercico1 {
    public static void main(String[] args) {
        //2.3
        int c;
        int thisIsAVariable;
        int q76354x;
        int value;
        String text = "This is a java program";

        System.out.println("Write a number(hint is 7): ");
        Scanner s = new Scanner(System.in);
        value = s.nextInt();
        if(value != 7){
            System.out.println("It's not equal 7");
        }else{
            System.out.println("It's seven(7)");
            System.out.printf("%s, using printf",text);
            System.out.println("This is a java program without '%s'");
        }
    }
}
