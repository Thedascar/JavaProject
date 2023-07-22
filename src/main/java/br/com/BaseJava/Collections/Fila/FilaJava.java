package br.com.BaseJava.Collections.Fila;

import java.util.LinkedList;
import java.util.Queue;

public class FilaJava {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        fila.add("Lucas");
        fila.offer("Aline");
        fila.offer("Bacon");
        fila.offer("Bob");
        fila.offer("Chico");

        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());

        //fila.size();
        //fila.clear();
        //fila.isEmpty();

        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
    }
}
