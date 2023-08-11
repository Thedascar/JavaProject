package br.com.ReinforcingJava.Threads.teste;

public class DeadLockTest01 {
    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();
        Runnable r1 = () -> {
            synchronized (lock1) {
                System.out.println("Thread 1: Segurando Lock 1");
                System.out.println("Thread 1: Esperando Lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: Segurando Lock 2");

                }
            }
        };
        Runnable r2 = () -> {
            synchronized (lock2) {
                System.out.println("Thread 2: Segurando Lock 2");
                System.out.println("Thread 2: Esperando Lock 1");
                synchronized (lock1) {
                    System.out.println("Thread 2: Segurando Lock 1");
                }
            }
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}

