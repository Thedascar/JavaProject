package br.com.ReinforcingJava.OOP.classeabstrata;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
        bonusSalario();
        digaa();
    }

    @Override
    public void digaa() {
        System.out.println("hi" + this.nome);
    }

    @Override
    public void bonusSalario() {
        this.salario = this.salario + this.salario * 0.50;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
