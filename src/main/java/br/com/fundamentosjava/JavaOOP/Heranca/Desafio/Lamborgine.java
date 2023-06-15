package br.com.fundamentosjava.JavaOOP.Heranca.Desafio;

public class Lamborgine extends Carro implements Esportivo,Luxo{

    public Lamborgine(int velocidadeMaxima) {
        super(velocidadeMaxima);
    }

    @Override
    public int acelerar() {
        velocidaAtual += delta;
        return super.acelerar();
    }

    @Override
    public int frear() {
        return super.frear();
    }

    @Override
    public void ligarTurbo() {
            delta = 50;
    }

    @Override
    public void desligarturbo() {

    }

    @Override
    public void liagrAr() {

    }

    @Override
    public void desligarAr() {

    }
}
