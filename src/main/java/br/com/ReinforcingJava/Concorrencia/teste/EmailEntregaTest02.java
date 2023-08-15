package br.com.ReinforcingJava.Concorrencia.teste;



import br.com.ReinforcingJava.Concorrencia.dominio.Membros;
import br.com.ReinforcingJava.Concorrencia.service.EmailEntregas;

import javax.swing.*;

public class EmailEntregaTest02 {
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
