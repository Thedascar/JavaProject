package br.com.ReinforcingJava.Threads.teste;

import br.com.ReinforcingJava.Threads.dominio.Membros;
import br.com.ReinforcingJava.Threads.service.EmailEntregas;

import javax.swing.*;

public class EmailEntregaTest01 {
    public static void main(String[] args) {

        Membros membros = new Membros();
        Thread lucas = new Thread(new EmailEntregas(membros), "Lucas");
        Thread aline = new Thread(new EmailEntregas(membros), "Aline");
        lucas.start();
        aline.start();

        while(true){
            String email = JOptionPane.showInputDialog("Entre com seu email: ");
            if(email == null || email.isEmpty()){
                membros.fechar();
                break;
            }
            membros.addMembrosEmail(email);
        }
    }
}
