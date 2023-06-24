package br.com.BoraJava.OOP.heranca.domain;

public class Funcionario extends Pessoa{
    private double salario;

    public Funcionario(String nome, int idade, Endereco endereco,double salario) {
        super(nome, idade, endereco);
        this.salario = salario;
    }
    @Override
    public void diga() {
        super.diga();
        System.out.println(salario);
    }

    public void imprimeRelatorio(){
        System.out.println(nome + " relatorio");
    }


}
