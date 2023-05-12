package br.com.fundamentosjava.Collections.EqualseHash;

public class EqualeHashCode {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Lucas","skjdhajs@hotmail.com");

        Usuario u2 = new Usuario("Lucas","skjdhajs@hotmail.com");


        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));


    }
}
