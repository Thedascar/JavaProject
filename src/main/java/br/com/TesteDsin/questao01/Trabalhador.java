package br.com.TesteDsin.questao01;

public class Trabalhador {
    private String nome;
    private double valorHora;
    private int diastrabalhados;

    public Trabalhador(String nome, double valorHora, int diastrabalhador) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.diastrabalhados = diastrabalhador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getDiastrabalhador() {
        return diastrabalhados;
    }

    public void setDiastrabalhador(int diastrabalhador) {
        this.diastrabalhados = diastrabalhador;
    }

    public void imprimeRelatorio(){
        double total = valorHora * diastrabalhados;
        double totalDesconto = total -= total * 0.15;
        System.out.println("Seja Bem Vindo (" + nome + ")");
        System.out.printf("Seu salário total é: %.2f",totalDesconto);
    }
}
