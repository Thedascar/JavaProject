package br.com.BaseJava.Collections.EqualseHash;

public class EqualeHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lucas");

        Usuario u2 = new Usuario("Lucas");


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));


    }
}
