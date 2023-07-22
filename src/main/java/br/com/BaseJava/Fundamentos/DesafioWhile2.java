package br.com.BaseJava.Fundamentos;

import java.util.Scanner;

public class DesafioWhile2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota = 0;
        double somaNota = 0;
        int contadorInvalido = 0;
        int contadorValido = 0;
        double media = 0;
        while(nota != -1){
            System.out.println("Digite a sua nota: ");
            nota = s.nextDouble();
            if(nota > 0 && nota <= 10){
                somaNota += nota;
                contadorValido += 1;
            }else{
                contadorInvalido += 1;
            }
            media = somaNota / contadorValido;
        }
        System.out.format("A Média foi de :  %02.2f\n",media);
        System.out.format("As notas válidas foram : %d\n",contadorValido);
        System.out.format("As inválidas foram: %d\n",contadorInvalido - 1);
        s.close();
    }
}
