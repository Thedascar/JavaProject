package br.com.BaseJava.Lambda;

public class TesteCalculo {

    public static void main(String[] args) {

        Calculo soma = new Soma();
        Calculo multiplicacao = new Multiplicar();


        System.out.println(soma.executar(10.0,10.0));
        System.out.println(multiplicacao.executar(12.0,10.0));
    }
}
