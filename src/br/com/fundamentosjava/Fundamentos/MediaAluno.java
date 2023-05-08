package br.com.fundamentosjava.Fundamentos;

import javax.swing.*;

public class MediaAluno {
    public static void main(String[] args) {
        double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        double mediaAluno = (nota1 + nota2) / 2;

        if(mediaAluno >= 7.0){
            System.out.println("Aprovado " + mediaAluno);
        } else if (mediaAluno < 7.0 && mediaAluno >= 4.0) {
            System.out.println("Recuperação " + mediaAluno);
        }else{
            System.out.println("Reprovado " + mediaAluno);
        }

    }
}
