package br.com.fundamentosjava.JavaOOP.Polimorfismo;

public class Jantar {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(89.70);

        Arroz arroz = new Arroz(0.100);
        Feijao feijao = new Feijao(0.100);
        Sorvete sorvete = new Sorvete(0.100);

        pessoa.comer(arroz);
        pessoa.comer(feijao);
        pessoa.comer(sorvete);


        System.out.println(pessoa.getPeso());
    }
}
