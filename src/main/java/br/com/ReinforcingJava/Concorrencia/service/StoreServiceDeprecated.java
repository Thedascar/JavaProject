package br.com.ReinforcingJava.Concorrencia.service;

import java.util.concurrent.*;

public class StoreServiceDeprecated {
    public double getPriceSync(String storename){
        System.out.printf("Pegando preços para store %s%n",storename);
        return priceGeneration();
    }

    private double priceGeneration(){
        System.out.printf("%s gerando o preço %n",Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
