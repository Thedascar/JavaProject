package br.com.fundamentosjava.Fundamentos;

public class SeparaLetra {
    public static void main(String[] args) {
        String nome = "Lucas";
        char letras[] = nome.toCharArray();
        for (int i = 0; i < nome.length(); i++) {
                System.out.println(letras[i]);
        }

    }

}