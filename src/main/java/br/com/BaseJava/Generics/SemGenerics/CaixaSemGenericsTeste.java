package br.com.BaseJava.Generics.SemGenerics;

public class CaixaSemGenericsTeste {
    public static void main(String[] args) {

        CaixaSemGenerics caixa1 = new CaixaSemGenerics();
        caixa1.guardar(2.3);

       Double coisa = (Double) caixa1.abrir();
        System.out.println(coisa);



        CaixaSemGenerics caixa2 = new CaixaSemGenerics();
        caixa2.guardar("Lucas");

        String coisa2 = (String) caixa2.abrir();
        System.out.println(coisa2);
    }
}
