package br.com.ReinforcingJava.Concorrencia.teste;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class BlockingQueueTest01 {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue bq = new ArrayBlockingQueue(1);
        bq.put("Lucas");
        System.out.printf("%s adicionou o valor %s%n ", Thread.currentThread().getName(),bq.peek());
        System.out.println("Tentando outro valor");
        new Thread(new RemoveFromQueue(bq)).start();
        bq.put("Aline");
        System.out.printf("%s adicionou o valor %s%n ", Thread.currentThread().getName(),bq.peek());

    }

    static class RemoveFromQueue implements Runnable{
        private final BlockingQueue<String> bq;

        public RemoveFromQueue(BlockingQueue<String> bq) {
            this.bq = bq;
        }

        @Override
        public void run() {
            System.out.printf("%s Colocando para dormin 2s %n ", Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(2);
                System.out.printf("%s removendo o valor da queue %s%n ", Thread.currentThread().getName(),bq.take());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
