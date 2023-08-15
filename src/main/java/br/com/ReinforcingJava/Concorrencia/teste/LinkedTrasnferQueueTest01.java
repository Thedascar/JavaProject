package br.com.ReinforcingJava.Concorrencia.teste;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TransferQueue;

public class LinkedTrasnferQueueTest01 {
    public static void main(String[] args) throws InterruptedException {

        TransferQueue<Object> tq = new LinkedTransferQueue<>();
        System.out.println(tq.add("Lucas"));
        System.out.println(tq.offer("Lucas"));
        System.out.println(tq.offer("Lucas",10, TimeUnit.SECONDS));
        tq.put("Aline");
        if(tq.hasWaitingConsumer()){
            tq.transfer("Aline");
        }
        System.out.println(tq.tryTransfer("Baby"));
        System.out.println(tq.tryTransfer("Baby",5, TimeUnit.SECONDS));
        System.out.println(tq.element());
        System.out.println(tq.peek());
        System.out.println(tq.poll());
        System.out.println(tq.remove());
        System.out.println(tq.take());
        System.out.println(tq.remainingCapacity());
    }
}
