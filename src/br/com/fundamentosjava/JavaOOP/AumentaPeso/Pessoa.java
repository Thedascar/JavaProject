package br.com.fundamentosjava.JavaOOP.AumentaPeso;

public class Pessoa {
    String nomePessoa;
    static double pesoPessoa;

    Pessoa(String nomePessoa,double pesoPessoa){
        this.nomePessoa = nomePessoa;
        Pessoa.pesoPessoa = pesoPessoa;
    }


    void comer(Pessoa pesoPessoa, Comida comida){
        double pesoTotal = Pessoa.pesoPessoa + comida.pesoComida;
        Pessoa.pesoPessoa = pesoTotal;
        System.out.printf("%s peso era de %.2f e agora é de %.2f\n",nomePessoa,Pessoa.pesoPessoa,pesoTotal);
        System.out.println(Pessoa.pesoPessoa);
    }

}
