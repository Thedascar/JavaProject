package br.com.fundamentosjava.Fundamentos;

import javax.swing.*;

public class DesafioCalculadora {
    public static void main(String[] args) {
        // ler num1 , num2
        // + - * / %
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite 0 1º número: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite 0 2º número: "));
        String sinal = JOptionPane.showInputDialog("Digite o sinal da operação: ");

        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;


        double res = sinal.equals("+")? soma : sinal.equals("-") ? subtracao : sinal.equals("*") ? multiplicacao : sinal.equals("/") ? divisao : 0;
        System.out.println(res);
    }
}
