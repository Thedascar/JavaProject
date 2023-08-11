package br.com.ReinforcingJava.Threads.teste;

import br.com.ReinforcingJava.Threads.dominio.Conta;

public class ThreadAccountTeste01 implements Runnable {
    private Conta conta = new Conta();
    public static void main(String[] args) {

        ThreadAccountTeste01 threadAccountTeste01 = new ThreadAccountTeste01();
        Thread t1 = new Thread(threadAccountTeste01,"Lucas");
        Thread t2 = new Thread(threadAccountTeste01,"Aline");


        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();

        t2.start();
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saque(10);
            if(conta.getSaldo() < 0){
                System.out.println("Valor negativo dentreo do run");
            }
        }
    }


    private synchronized void saque(int quantidade){
        if(conta.getSaldo() >= quantidade ){
            System.out.println(getThreadName() + " está indo sacar dinheiro");
            conta.saque(quantidade);
            System.out.println(getThreadName() + " saque feito, valro atual: " + conta.getSaldo());
       }else{
            System.out.println("Tá Duro" + getThreadName()+ " efetuar o saque "+ conta.getSaldo());
        }
    }

    private String getThreadName(){
        return Thread.currentThread().getName();
    }


}
