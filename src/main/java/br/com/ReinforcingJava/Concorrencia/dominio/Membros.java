package br.com.ReinforcingJava.Concorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean aberto = true;
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();



    public boolean isAberto() {
        return aberto;
    }

    public int emailsPendentes() {

        lock.lock();
        try {
            return emails.size();
        }finally {
            lock.unlock();
        }
    }

    public void addMembrosEmail(String email){
        lock.lock();
        try {
            String threadNome = Thread.currentThread().getName();
            System.out.println(threadNome + " Adicionou email na lista: ");
            this.emails.add(email);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    public String devolveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " Check se há emails");
        lock.lock();
        try {
            while (emails.size() == 0) {
                if (!isAberto()) return null;
                System.out.println(Thread.currentThread().getName() + " Não tem email disponivel na lista," +
                        "entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        }finally {
            lock.unlock();
        }
    }

    public void fechar() {
        aberto = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " Notificando todo mundo qeu não estamos mais pegando emails. ");
            condition.signalAll();
        }finally {
            lock.unlock();
     }
    }
}
