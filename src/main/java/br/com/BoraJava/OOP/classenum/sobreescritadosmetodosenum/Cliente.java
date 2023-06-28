package br.com.BoraJava.OOP.classenum.sobreescritadosmetodosenum;

public class Cliente {
    private String nome;
    private int idade;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, int idade, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.idade = idade;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }
}
