package br.com.fundamentosjava.Fundamentos;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner s = new Scanner(System.in);
        int jogada = 0;
        int numeroAleatorio = gerador.nextInt(1,10);
        int tentativas = 0;
        while (tentativas < 10) {
            System.out.println("Digite o número desejado: ");
            jogada = s.nextInt();
            if (jogada == numeroAleatorio) {
                System.out.println("Parabéns você acertou");
                break;
            } else if (jogada > numeroAleatorio) {
                System.out.println("Esta acima");
                tentativas += 1;
            } else {
                System.out.println("Esta abaixo");
                tentativas += 1;
            }
            System.out.println("Você já usou " + tentativas + " de 10 tentativas");
        }
    }
}
