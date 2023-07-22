package br.com.ReinforcingJava.OOP.classeabstrata;

public class Dev extends Funcionario{
    public Dev(String nome, double salario) {
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
        this.salario = this.salario + this.salario * 0.20;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
