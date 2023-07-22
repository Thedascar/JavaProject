package br.com.ReinforcingJava.OOP.classenum.sobreescritadosmetodosenum;

public class TestClient {
    public static void main(String[] args) {

        var cliente = new Cliente("Lucas",28,TipoPagamento.CREDITO);
        var cliente2 = new Cliente("Aline",28,TipoPagamento.DEBITO);
        System.out.println(cliente.getTipoPagamento().selecioValor(200.00));
        System.out.println(cliente2.getTipoPagamento().selecioValor(200.00));
    }
}
