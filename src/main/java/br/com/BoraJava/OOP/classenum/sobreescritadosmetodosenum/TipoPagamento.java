package br.com.BoraJava.OOP.classenum.sobreescritadosmetodosenum;

public enum TipoPagamento {
   DEBITO{
       @Override
       double selecioValor(double valor) {
           return valor * 0.20;
       }
   },CREDITO{
        @Override
        double selecioValor(double valor) {
            return valor * 0.10;
        }
    };

   abstract double selecioValor(double valor);
}
