package br.com.ReinforcingJava.OOP.classeabstrata;

public abstract class Funcionario extends ClasseAbstrataAvo {
    protected String nome;
    protected double salario;


    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract void bonusSalario();
}
