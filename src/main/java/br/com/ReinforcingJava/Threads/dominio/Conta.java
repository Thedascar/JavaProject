package br.com.ReinforcingJava.Threads.dominio;

public class Conta {
    private int saldo = 50;


    public void saque(int quantidade){
        this.saldo = this.saldo-quantidade;
    }



    public int getSaldo() {
        return saldo;
    }
}
