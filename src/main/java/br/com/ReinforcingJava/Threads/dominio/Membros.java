package br.com.ReinforcingJava.Threads.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean aberto = true;

    public boolean isAberto() {
        return aberto;
    }

    public int emailsPendentes(){
        synchronized (emails){
            return emails.size();
        }
    }
    public void addMembrosEmail(String email){
        synchronized (emails){
            String threadNome = Thread.currentThread().getName();

            System.out.println(threadNome+ " Adicionou email na lista: ");
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String devolveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " Check se há emails");
        synchronized (emails){
            while(emails.size() == 0){
                if(!isAberto())return null;
                System.out.println(Thread.currentThread().getName()+" Não tem email disponivel na lista," +
                        "entrando em modo de espera");
                this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void fechar() {
        aberto = false;
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo qeu não estamos mais pegando emails. ");
            this.emails.notifyAll();
        }
    }
}
