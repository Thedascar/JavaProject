package br.com.Deitel.cap2.exercicios;

public class Exericio7 {
    public static void main(String[] args) {
        int a = 758;
        int b = 20;
        int c = 1080;
        int d = 500;
        int e = 3526;
        String res = "";
        String menor = "";


        if (a > b && a > c && a > d && a > e) {
            res = "A";
        } else {
            if (b > a && b > c && b > d && b > e) {
                res = "B";
            } else {
                if (c > a && c > b && c > d && c > e) {
                    res = "C";
                } else {
                    if (d > a && d > b && d > c && d > e) {
                        res = "D";
                    } else {
                        res = "E";
                    }
                }
            }
        }

        if (a < b && a < c && a < d && a < e) {
            menor = "A";
        } else {
            if (b < a && b < c && b < d && b < e) {
                menor = "B";
            } else {
                if (c < a && c < b && c < d && c < e) {
                    menor = "C";
                } else {
                    if (d < a && d < b && d < c && d < e) {
                        menor = "D";
                    } else {
                        menor = "E";
                    }
                }
            }
        }
        System.out.println(res);
        System.out.println(menor);
    }
}