package br.com.fundamentosjava.JavaOOP.Heranca.Desafio;

public class Lamborgine extends Carro {

    public Lamborgine(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public int acelerar() {
        velocidaAtual += 100;
        return super.acelerar();
    }

    @Override
    public int frear() {
        return super.frear();
    }
}
