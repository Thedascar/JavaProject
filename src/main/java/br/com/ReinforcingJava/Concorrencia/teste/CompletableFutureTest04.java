package br.com.ReinforcingJava.Concorrencia.teste;

import br.com.ReinforcingJava.Concorrencia.dominio.Orcamento;
import br.com.ReinforcingJava.Concorrencia.service.StoreServiceWithDiscount;


import java.util.List;

public class CompletableFutureTest04 {
    public static void main(String[] args) {
        StoreServiceWithDiscount storeServiceWithDiscount = new StoreServiceWithDiscount();
        searchPricesWithDiscount(storeServiceWithDiscount);

    }

    private static void searchPricesWithDiscount(StoreServiceWithDiscount service){
        List<String> stores = List.of("Store 01","Store 02","Store 03","Store 04");
        stores.forEach(s -> System.out.println(service.getPriceSync(s)));
        //stores.stream().map(service::getPriceSync).map(Orcamento::newOrcamento).map(service::applyDesconto).forEach(System.out::println);
    }
}
