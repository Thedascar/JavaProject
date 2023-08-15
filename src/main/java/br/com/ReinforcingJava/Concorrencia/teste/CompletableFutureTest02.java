package br.com.ReinforcingJava.Concorrencia.teste;

import br.com.ReinforcingJava.Concorrencia.service.StoreService;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CompletableFutureTest02 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreService storeService = new StoreService();
        getPriceAsyncCompletableFuture(storeService);
    }
    private static void getPriceAsyncCompletableFuture(StoreService storeService) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2","Store 3","Store 4");
        List<CompletableFuture<Double>> collect = stores.stream()
                .map(storeService::getPriceAsyncCompletableFuture)
                .collect(Collectors.toList());
        List<Double> collect1 = collect.stream().map(CompletableFuture::join)
                .collect(Collectors.toList());
        System.out.println(collect1);
        long end = System.currentTimeMillis();
        System.out.printf("tempo gasto na pesquisa %d%n",(end-start));
        StoreService.shutdown();
    }
}
