package br.com.BaseJava.JavaOOP.Heranca.Desafio;

public abstract class Carro {

     public final int VELOCIDADE_MAXIMA;
     protected int velocidaAtual;

     protected int delta = 20;

    public Carro(int velocidaMaxima){
        this.VELOCIDADE_MAXIMA = velocidaMaxima;
    }


    public int getVelocidaAtual() {
        return velocidaAtual;
    }

    public void setVelocidaAtual(int velocidaAtual) {
        this.velocidaAtual = velocidaAtual;
    }

    public int acelerar() {

        if (velocidaAtual < VELOCIDADE_MAXIMA) {
            velocidaAtual += delta;
        } else {
            velocidaAtual = VELOCIDADE_MAXIMA - this.delta;
        }
        return 0;
    }

     public int frear() {
        if (velocidaAtual > 0) {
            velocidaAtual -= 15;
        }
        return velocidaAtual;
    }
}