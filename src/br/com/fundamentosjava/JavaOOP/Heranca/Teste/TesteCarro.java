package br.com.fundamentosjava.JavaOOP.Heranca.Teste;

import br.com.fundamentosjava.JavaOOP.Heranca.Desafio.Carro;
import br.com.fundamentosjava.JavaOOP.Heranca.Desafio.Lamborgine;
import br.com.fundamentosjava.JavaOOP.Heranca.Desafio.Palio;

public class TesteCarro {
    public static void main(String[] args) {


        Carro l = new Lamborgine(300);
        Carro p = new Palio(100);

        l.velocidadeAtualAltera(50);
        p.velocidadeAtualAltera(50);

        l.acelerar();
        l.acelerar();
        l.acelerar();
        l.frear();
        l.acelerar();


        System.out.println("A velocidade atual da L é: " + l.velocidadeConsulta());

        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.frear();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        p.acelerar();
        System.out.println("A velocidade atual do P é: " + p.velocidadeConsulta());
    }
}
