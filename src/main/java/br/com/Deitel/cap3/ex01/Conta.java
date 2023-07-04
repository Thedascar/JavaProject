package br.com.Deitel.cap3.ex01;

public class Conta {
    private String nome;
    private double saldo;
    private double saque;

    public Conta(String nome, double saldo) {
        this.nome = nome;
        if(saldo > 0.0){
            this.saldo = saldo;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo > 0.0){
            this.saldo += saldo;
        }else{
            System.out.println("Valor negativo não aceito!!!!");
        }
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        if(saque < saldo && saque > 0.0){
            this.saldo -= saque;
        }else{
            System.out.println("Valor de saque inválido");
        }
    }
    public void display(Conta conta){

        System.out.println("Conta: " +  conta.getNome());
        System.out.println("Saldo: " +  conta.getSaldo());

    }
}
