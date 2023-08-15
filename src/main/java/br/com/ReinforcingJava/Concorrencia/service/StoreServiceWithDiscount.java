package br.com.ReinforcingJava.Concorrencia.service;

import br.com.ReinforcingJava.Concorrencia.dominio.Desconto;
import br.com.ReinforcingJava.Concorrencia.dominio.Orcamento;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {
    public String getPriceSync(String storename){
        double price =  priceGeneration();
        Desconto.Code codigoDesconto = Desconto.Code.values()[ThreadLocalRandom.current().nextInt(Desconto.Code.values().length)];

        return String.format("%s:%.2f:%s",storename,price,codigoDesconto);
    }


    public String applyDesconto(Orcamento orcamento){
        delay();
        double discountValue = orcamento.getPrco() * (100 - orcamento.getDescontoCode().getPorcentagem()) / 100;
        return String.format("%s Preço Original : %.2f Aplicando codigo de desconto : %s Preço final: %.2f  ", orcamento.getStore(), orcamento.getPrco(),orcamento.getDescontoCode(), discountValue);
    }
    private double priceGeneration(){
        delay();
        return ThreadLocalRandom.current().nextInt(1,500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
