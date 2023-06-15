package br.com.fundamentosjava.Generics.ComGenerics;

public class CaixaIntTeste {
    public static void main(String[] args) {

        CaixaInt caixa1 = new CaixaInt();
        caixa1.guardar(1000);

        System.out.println(caixa1.abrir());
    }
}
