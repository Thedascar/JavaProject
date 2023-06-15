package br.com.fundamentosjava.Streams;

public class testeMedia {
    public static void main(String[] args) {

        Media m1 = new Media().adicionar(8.3).adicionar(7.3).adicionar(5.3);
        Media m2 = new Media().adicionar(9.3).adicionar(5.3).adicionar(7.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1,m2).getValor());
    }
}
