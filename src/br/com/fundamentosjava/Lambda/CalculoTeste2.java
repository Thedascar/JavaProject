package br.com.fundamentosjava.Lambda;

public class CalculoTeste2 {
    public static void main(String[] args) {

        Calculo calc = (x,y) -> {return x + y;};

        System.out.println(calc.executar(2.3,3.4));

        calc = (x,y) -> x * y;

        System.out.println(calc.executar(2.0,3.0));

    }
}
