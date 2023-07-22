package br.com.BaseJava.JavaOOP.Heranca.Teste;

import br.com.BaseJava.JavaOOP.Heranca.Desafio.Lamborgine;
import br.com.BaseJava.JavaOOP.Heranca.Desafio.Palio;

public class TesteCarro {
    public static void main(String[] args) {


        Lamborgine l = new Lamborgine(300);
        Palio p = new Palio(150);

        l.setVelocidaAtual(30);
        p.setVelocidaAtual(30);

        l.ligarTurbo();
        l.acelerar();
        l.acelerar();
        l.acelerar();
        l.acelerar();


        System.out.println("A velocidade atual da L é: " + l.getVelocidaAtual());


        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();


        System.out.println("A velocidade atual do P é: " + p.getVelocidaAtual());
    }
}
