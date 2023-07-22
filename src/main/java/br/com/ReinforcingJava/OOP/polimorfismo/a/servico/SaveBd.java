package br.com.ReinforcingJava.OOP.polimorfismo.a.servico;

import br.com.ReinforcingJava.OOP.polimorfismo.a.repositorio.Repository;

public class SaveBd implements Repository{
    @Override
    public void save() {
        System.out.println("Salvando no BD");
    }
}
