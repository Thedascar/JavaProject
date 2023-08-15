package br.com.ReinforcingJava.Concorrencia.teste;

import br.com.ReinforcingJava.Concorrencia.service.StoreService;
import br.com.ReinforcingJava.Concorrencia.service.StoreServiceDeprecated;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

public class CompletableFutureTest03 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        StoreServiceDeprecated storeServiceDeprecated = new StoreServiceDeprecated();
        getPriceAsyncCompletableFuture(storeServiceDeprecated);
    }
    private static void getPriceAsyncCompletableFuture(StoreServiceDeprecated storeServiceDeprecated) throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        List<String> stores = List.of("Store 1","Store 2","Store 3","Store 4");

        List<CompletableFuture<Double>> collect = stores.stream()
                .map(s -> CompletableFuture.supplyAsync(() -> storeServiceDeprecated.getPriceSync(s)))
                .collect(Collectors.toList());

        List<Double> collect1 = collect.stream()
                .map(CompletableFuture::join)
                .collect(Collectors.toList());

        System.out.println(collect1);
        long end = System.currentTimeMillis();
        System.out.printf("tempo gasto na pesquisa %d%n",(end-start));
    }
}
