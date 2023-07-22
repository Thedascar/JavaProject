package br.com.BaseJava.Fundamentos;

import javax.swing.*;

public class VerificaNumero {
    public static void main(String[] aaaa) {
        boolean a = true;
        while (a){
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número entre 0 - 10"));
            if(numero > 0 && numero < 10 && numero % 2 == 0){
                System.out.format("O número é par %d \n",numero);
                a = false;
            }else{
                System.out.format("O número é ímpar %d \n",numero);
            }
            System.out.println("Fim");
        }
    }
}
