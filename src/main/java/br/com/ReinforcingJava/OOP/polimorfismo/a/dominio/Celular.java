package br.com.ReinforcingJava.OOP.polimorfismo.a.dominio;

public class Celular extends Produto{
    private String dataDaCompra;

    public Celular(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double taxa() {
        return preco * 0.20;
    }

    public String getDataDaCompra() {
        return dataDaCompra;
    }

    public void setDataDaCompra(String dataDaCompra) {
        this.dataDaCompra = dataDaCompra;
    }
}
