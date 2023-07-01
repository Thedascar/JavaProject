package br.com.BoraJava.OOP.polimorfismo.a.teste;

import br.com.BoraJava.OOP.polimorfismo.a.repositorio.Repository;
import br.com.BoraJava.OOP.polimorfismo.a.servico.BancoDeDados;
import br.com.BoraJava.OOP.polimorfismo.a.servico.SaveArquivo;
import br.com.BoraJava.OOP.polimorfismo.a.servico.SaveBd;

public class TesteC {
    public static void main(String[] args) {
        Repository rep1 = new SaveArquivo();
        Repository rep2 = new SaveBd();
        Repository rep3 = new BancoDeDados();

        rep1.save();
        rep2.save();
        rep3.save();
    }
}
