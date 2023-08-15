package br.com.ReinforcingJava.Concorrencia.dominio;

public final class Orcamento {
    private final String store;
    private final double prco;
    private final Desconto.Code descontoCode;

    private Orcamento(String store, double prco, Desconto.Code descontoCode) {
        this.store = store;
        this.prco = prco;
        this.descontoCode = descontoCode;
    }

    public static Orcamento newOrcamento(String value){
        String[] values = value.split(":");
        return new Orcamento(values[0],Double.parseDouble(values[1]),Desconto.Code.valueOf(values[2]));
    }





    public String getStore() {
        return store;
    }

    public double getPrco() {
        return prco;
    }

    public Desconto.Code getDescontoCode() {
        return descontoCode;
    }
}
