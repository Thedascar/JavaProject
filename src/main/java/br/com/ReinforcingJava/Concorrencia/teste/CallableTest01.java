package br.com.ReinforcingJava.Concorrencia.teste;


import java.util.concurrent.*;

class RandonNumberCallable implements Callable<String>{

    @Override
    public String call() throws Exception {
        int count = ThreadLocalRandom.current().nextInt(1,11);
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...%n",Thread.currentThread().getName());

        }
        return String.format("%s o número aleátorio é %d%n",Thread.currentThread().getName(),count);
    }
}
public class CallableTest01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RandonNumberCallable randonNumberCallable = new RandonNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<String> fututure = executorService.submit(randonNumberCallable);
        String s = fututure.get();
        System.out.printf("Programa terminado %s ",s);
        executorService.shutdown();
    }
}
