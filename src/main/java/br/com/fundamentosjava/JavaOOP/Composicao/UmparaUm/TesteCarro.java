package br.com.fundamentosjava.JavaOOP.Composicao.UmparaUm;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.estaLiagado());
        c1.ligado();
        System.out.println(c1.estaLiagado());

        System.out.println(c1.motor.giros());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        System.out.println(c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        System.out.println(c1.motor.giros());

    }
}
