package br.com.BaseJava.Fundamentos;

public class NumeroPrimov1 {
    public static void main(String[] args) {

        int contdiv = 0;
        int numero = 6;
        for (int i = 2; i < numero ; i++) {
            if(numero % i == 0){
                contdiv++;
            }
        }
        if(contdiv == 0){
            System.out.println("o numero " + numero + " é primo");
        }else
            System.out.println("o numero " + numero + " não é primo");
    }
}




