package br.com.BaseJava.Fundamentos;

public class NumeroPrimoV2 {
    public static void main(String[] args) {


        int contdiv = 0;
        int numero = 5;
        for (int i = 2; i < numero ; i++) {
            if(numero % i == 0){
                contdiv++;
            }
        }
        switch (contdiv){
            case 0:
                System.out.println("o numero " + numero + " é primo");
                break;
            default:
                System.out.println("o numero " + numero + " não é primo");
        }
    }
}
