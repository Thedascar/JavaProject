package br.com.ReinforcingJava.OOP.domain;

public class PessoaStatic {
    private String nome;
    private int idade;
    private static int count;
    private static String cpf = "000.000.000-00";

    static {
    System.out.println("Executed once time in jvm first run !!!!");
    }
    {
        System.out.println("Person has been created");
        count++;
    }

    public PessoaStatic(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
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

    public static void setCount(int count) {
        PessoaStatic.count = count;
    }

    public static void setCpf(String cpf) {
        PessoaStatic.cpf = cpf;
    }

    public static int getCount() {
        System.out.println(count + " Persons has been created");
        return count;
    }

    public static String getCpf() {
        return cpf;
    }

    public static void mostraCpf(){
        System.out.println("This is the blank model cpf: " + cpf);
    }
    public static void mostraCount(){
        System.out.println(count + " Persons has been created");
    }
}
