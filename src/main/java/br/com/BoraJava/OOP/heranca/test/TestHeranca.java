package br.com.BoraJava.OOP.heranca.test;

import br.com.BoraJava.OOP.heranca.domain.Endereco;
import br.com.BoraJava.OOP.heranca.domain.Funcionario;
import br.com.BoraJava.OOP.heranca.domain.Pessoa;

public class TestHeranca {
    public static void main(String[] args) {

        var rua11 = new Endereco("Rua existente",695);

        var pessoa1 = new Pessoa("Lucas",28,rua11);

        pessoa1.diga();


        var func1 = new Funcionario("Aline",26,rua11,2580.87);
        func1.diga();
        func1.imprimeRelatorio();
    }
}
