package br.com.ReinforcingJava.Threads.teste;

class Exemplo2 extends Thread implements Runnable {
    private final String c;

    public Exemplo2(String c) {
        this.c = c;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            Thread.yield();
        }
    }
}
public class ThreadTest02 {
    public static void main(String[] args) {

        Thread t1 = new Thread(new Exemplo2("KA"));
        Thread t2 = new Thread(new Exemplo2("ME"));
        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();


    }
}
