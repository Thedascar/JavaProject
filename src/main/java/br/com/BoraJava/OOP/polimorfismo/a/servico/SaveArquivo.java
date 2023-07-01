package br.com.BoraJava.OOP.polimorfismo.a.servico;

import br.com.BoraJava.OOP.polimorfismo.a.repositorio.Repository;

public class SaveArquivo implements Repository{
    @Override
    public void save() {
        System.out.println("Salvando Arquivo");
    }
}
