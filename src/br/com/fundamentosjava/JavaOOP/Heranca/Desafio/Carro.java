package br.com.fundamentosjava.JavaOOP.Heranca.Desafio;

public class Carro {

     public final int VELOCIDADE_MAXIMA;
     protected int velocidaAtual;

    public Carro(int velocidaMaxima){
        this.VELOCIDADE_MAXIMA = velocidaMaxima;
    }


    public int velocidadeAtualAltera(int velocidade){
        this.velocidaAtual = velocidade;
        return this.velocidaAtual;
    }

    public int velocidadeConsulta(){
        return this.velocidaAtual;
    }

     public int acelerar() {

        if (velocidaAtual < VELOCIDADE_MAXIMA) {
            velocidaAtual += 10;
        }else{
            velocidaAtual = VELOCIDADE_MAXIMA;
        }
        return velocidaAtual;
    }

     public int frear() {
        if (velocidaAtual > 0) {
            velocidaAtual -= 15;
        }
        return velocidaAtual;
    }
}