package br.com.Deitel.cap2.exercicios;

public class Exercicio12 {
    public static void main(String[] args) {
        int neg = 0;
        int pos = 0;
        int zero = 0;

        int a = 0;
        if(a == 0){
            zero += 1;
        }else if (a > 0){
            pos += 1;
        } else{
            neg += 1;
        }

        int b = 0;
        if(b == 0){
            zero += 1;
        }else if (b > 0){
            pos += 1;
        } else{
            neg += 1;
        }

        int c = 0;
        if(c == 0){
            zero += 1;
        }else if (c > 0){
            pos += 1;
        } else{
            neg += 1;
        }

        int d = -10;
        if(d == 0){
            zero += 1;
        }else if (d > 0){
            pos += 1;
        } else{
            neg += 1;
        }

        int e = 10;
        if(e == 0){
            zero += 1;
        }else if (e > 0){
            pos += 1;
        } else{
            neg += 1;
        }


        System.out.println("Pos: " + pos);
        System.out.println("Neg: " + neg);
        System.out.println("Zero " + zero);



    }
}
