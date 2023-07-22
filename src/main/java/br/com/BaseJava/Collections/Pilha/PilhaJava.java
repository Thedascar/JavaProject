package br.com.BaseJava.Collections.Pilha;

import java.util.ArrayDeque;
import java.util.Deque;

public class PilhaJava {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();

        livros.add("Mais esperto");
        livros.push("O Rei");
        livros.push("Java");

        System.out.println(livros);

        System.out.println(livros.peek());
        System.out.println(livros.element());

        livros.poll();
        livros.poll();

        System.out.println(livros.isEmpty());
        System.out.println(livros);
    }
}
