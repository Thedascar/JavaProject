package br.com.fundamentosjava.JavaOOP.AumentaPeso;

public class Pessoa {
    String nomePessoa;
    double pesoPessoa;

    Pessoa(String nomePessoa,double pesoPessoa){
        this.nomePessoa = nomePessoa;
        this.pesoPessoa = pesoPessoa;
    }


    void comer(Pessoa pessoa, Comida comida){
        double pesoTotal = pessoa.pesoPessoa + comida.pesoComida;
        System.out.printf("%s peso era de %.2f e agora é de %.2f\n",pessoa.nomePessoa,pessoa.pesoPessoa,pesoTotal);
        pessoa.pesoPessoa += comida.pesoComida;
        System.out.println(pessoa.pesoPessoa);
    }

}
