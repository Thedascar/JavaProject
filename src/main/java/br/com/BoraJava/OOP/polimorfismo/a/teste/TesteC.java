package br.com.BoraJava.OOP.polimorfismo.a.teste;

import br.com.BoraJava.OOP.polimorfismo.a.servico.BancoDeDados;
import br.com.BoraJava.OOP.polimorfismo.a.servico.SaveArquivo;
import br.com.BoraJava.OOP.polimorfismo.a.servico.SaveBd;

public class TesteC {
    public static void main(String[] args) {
        BancoDeDados banco = new SaveArquivo();
        BancoDeDados banco2 = new SaveBd();
        banco.save();
        banco2.save();
    }
}
