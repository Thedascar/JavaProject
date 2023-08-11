package br.com.ReinforcingJava.Concorrencia;


import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Contador {
    private int count;
    private AtomicInteger atomicInteger = new AtomicInteger();
    private Lock lock = new ReentrantLock(true);
    void incremento(){
        lock.lock();
        try{
            count++;
            atomicInteger.incrementAndGet();
        }finally {
            lock.unlock();
        }

    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public int getCount() {
        return count;
    }
}


public class AtomicIntegerTest01 {
    public static void main(String[] args) throws InterruptedException {
        Contador contador = new Contador();
        Runnable r = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incremento();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(contador.getCount());
        System.out.println(contador.getAtomicInteger());
    }
}
