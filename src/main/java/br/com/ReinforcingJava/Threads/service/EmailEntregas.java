package br.com.ReinforcingJava.Threads.service;

import br.com.ReinforcingJava.Threads.dominio.Membros;

public class EmailEntregas implements Runnable{
    private final Membros membros;

    public EmailEntregas(Membros membros) {
        this.membros = membros;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
    System.out.println(threadName+ " Começando a entregar os emails");
    while(membros.isAberto() || membros.emailsPendentes() > 0 ){
        try {
            String email = membros.devolveEmail();
            if(email == null) continue;
            System.out.println(threadName + "enviando email para "+email);
            Thread.sleep(2000);
            System.out.println(threadName + " enviou email com sucesso para "+ email);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
        System.out.println("Todos os email foram enviado com sucesso");
    }
}
