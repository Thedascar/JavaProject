package br.com.ReinforcingJava.Collections.teste;


import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {

        Queue<String> a = new PriorityQueue<>();

        a.add("c");
        a.add("a");
        a.add("b");


       while(!a.isEmpty()){
           System.out.println(a.remove());
       }
        System.out.println(a);

    }
}
