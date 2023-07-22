package br.com.BaseJava.Fundamentos;

import javax.swing.*;

public class DesafioTernario {
    public static void main(String[] args) {

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));

    String baixo = a <= 1000 ? "Pobre" : "Ainda Pobre";
    String medio = a <= 5000 ? "Pobre medio" : "Rico";

    String res = a > 1000 ? medio : baixo;
    System.out.println(res);
    }
}
