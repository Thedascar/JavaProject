package br.com.ReinforcingJava.Threads.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ThreadSafeNomes{
    private final List<String> nomes = Collections.synchronizedList(new ArrayList<>());

    public void add (String nome){
        nomes.add(nome);
    }

    public synchronized void removeOPrimeiro(){
        if(nomes.size() > 0){
            System.out.println(Thread.currentThread().getName());
            System.out.println(nomes.remove(0));
            System.out.println(Thread.currentThread().getName());
        }
    }
}


public class ThreadSafeTest01 {
    public static void main(String[] args) {

        ThreadSafeNomes threadSafeNomes = new ThreadSafeNomes();
        threadSafeNomes.add("Lucas");
        Runnable run = threadSafeNomes::removeOPrimeiro;
        new Thread(run).start();
        new Thread(run).start();

    }
}
