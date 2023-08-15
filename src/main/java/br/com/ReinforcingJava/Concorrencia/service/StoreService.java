package br.com.ReinforcingJava.Concorrencia.service;

import java.util.concurrent.*;

public class StoreService {
private static final ExecutorService ex = Executors.newCachedThreadPool();
    public double getPriceSync(String storename){
        System.out.printf("Pegando preços para store %s%n",storename);
        return priceGeneration();
    }

    public Future<Double> getPriceAsyncFuture(String storename){
        System.out.printf("pegando os preço sync da store %s%n",storename);
        return ex.submit(this::priceGeneration);

    }
    public CompletableFuture<Double> getPriceAsyncCompletableFuture(String storename){
        System.out.printf("pegando os preço sync da store %s%n",storename);
        return CompletableFuture.supplyAsync(this::priceGeneration);

    }

    private double priceGeneration(){
        System.out.printf("%s gerando o preço %n",Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }
    public static void shutdown(){
        ex.shutdown();
    }
    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
