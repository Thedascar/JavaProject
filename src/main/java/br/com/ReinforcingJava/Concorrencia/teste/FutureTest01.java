package br.com.ReinforcingJava.Concorrencia.teste;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args){
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
                TimeUnit.SECONDS.sleep(2);
                return 4.35D;
        });
        System.out.println(doingSomething());
        double dollarResponse = 0;
        try {
            dollarResponse = dollarRequest.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: "+ dollarResponse);
        executorService.shutdown();
    }
    private static long doingSomething(){
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum += i;
        }
        return sum;
    }
}
