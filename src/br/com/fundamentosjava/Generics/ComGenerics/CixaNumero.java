package br.com.fundamentosjava.Generics.ComGenerics;

public class CixaNumero {
    public static void main(String[] args) {


        CaixaNumero<Double> caixa1 = new CaixaNumero<>();

        caixa1.guardar(41.45);
        System.out.println(caixa1.abrir());


        CaixaNumero<Long> caixa2 = new CaixaNumero<>();

        caixa2.guardar(15545645165451564L);
        System.out.println(caixa2.abrir());
    }
}
