package br.com.fundamentosjava.Fundamentos;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int ano = 0;
        System.out.println("Digite o Ano Desejado(Apens o final) : 20__");
        ano = s.nextInt();
        if(ano % 4 == 0){
            System.out.format("Ano Bissexto --> 20%d",ano);
        }else{
            System.out.format("Ano Normal --> 20%d",ano);
        }
    }
}
