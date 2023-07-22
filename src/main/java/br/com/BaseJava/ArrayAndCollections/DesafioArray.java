package br.com.BaseJava.ArrayAndCollections;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DesafioArray {
    public static void main(String[] args) {


        int digitaQuantidadeNotas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas a serem adicionadas: "));
        List<Double> arrayDeNotas = new ArrayList<Double>();
        int iterador = 0;
        double somaTotal = 0.0;
        while(iterador < digitaQuantidadeNotas){
            double notasAlunos = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: {" +  (iterador + 1) + "º} : "));
            iterador++;
            arrayDeNotas.add(notasAlunos);
            somaTotal += notasAlunos;
        }
        for (int i = 0; i < arrayDeNotas.size(); i++) {
            System.out.println("A "+ (i + 1) + "º nota foi : " + arrayDeNotas.get(i));
        }
        System.out.println("E a média foi de: " + somaTotal / arrayDeNotas.size() );
    }
}
