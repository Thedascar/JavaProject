package br.com.ReinforcingJava.Concorrencia.teste;

import br.com.ReinforcingJava.Concorrencia.service.StoreService;

import java.util.concurrent.ExecutionException;

public class CompletableFutureTest01 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
        //searchPricesSync(storeService);
        //getPriceAsyncFuture(storeService);
        getPriceAsyncCompletableFuture(storeService);
    }

    private static void searchPricesSync(StoreService storeService){
        long start = System.currentTimeMillis();
        System.out.println(storeService.getPriceSync("Store 1"));
        System.out.println(storeService.getPriceSync("Store 2"));
        System.out.println(storeService.getPriceSync("Store 3"));
        System.out.println(storeService.getPriceSync("Store 4"));
        long end = System.currentTimeMillis();
        System.out.printf("tempo gasto na pesquisa %d%n",(end-start));
    }
    private static void getPriceAsyncFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        try {
            storeService.getPriceAsyncFuture("Store 1").get();
            storeService.getPriceAsyncFuture("Store 2").get();
            storeService.getPriceAsyncFuture("Store 3").get();
            storeService.getPriceAsyncFuture("Store 4").get();
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("tempo gasto na pesquisa %d%n",(end-start));
        StoreService.shutdown();
    }
    private static void getPriceAsyncCompletableFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        try {
            storeService.getPriceAsyncCompletableFuture("Store 1").get();
            storeService.getPriceAsyncCompletableFuture("Store 2").get();
            storeService.getPriceAsyncCompletableFuture("Store 3").get();
            storeService.getPriceAsyncCompletableFuture("Store 4").get();
        }catch (InterruptedException | ExecutionException e){
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.printf("tempo gasto na pesquisa %d%n",(end-start));
        StoreService.shutdown();
    }
}
