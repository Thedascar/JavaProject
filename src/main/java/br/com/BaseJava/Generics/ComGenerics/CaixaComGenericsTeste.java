package br.com.BaseJava.Generics.ComGenerics;

public class CaixaComGenericsTeste<X> {
    public static void main(String[] args) {

        CaixaComGenerics<String> caixa1 = new CaixaComGenerics<>();
        caixa1.guardar("Lucas Com Generics");

        System.out.println(caixa1.abrir());



        CaixaComGenerics<Double> caixa2 = new CaixaComGenerics<>();
        caixa2.guardar(8.4);

        System.out.println(caixa2.abrir());


    }
}
