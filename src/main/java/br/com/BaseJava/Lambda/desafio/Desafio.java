package br.com.BaseJava.Lambda.desafio;
import br.com.BaseJava.Lambda.Produto;

import java.util.function.*;


public class Desafio {
    public static void main(String[] args) {

        Produto p1 = new Produto("S21 Fe 128GB",3967.45,0.10);

        BinaryOperator<Double> descontoProduto = (aDouble, aDouble2) -> aDouble * (1 - aDouble2);

        UnaryOperator<Double> impostoMunicipal =  o -> o >= 2500.00 ? (o * 0.085) + o : o;

        UnaryOperator<Double> freteProduto =  o -> o >= 3000.00 ? o + 100 : o + 50;

       Double res = (descontoProduto.andThen(impostoMunicipal).andThen(freteProduto).apply(p1.preco,p1.desconto));
        System.out.printf("O valor total é : R$  %.2f",res);

    }
}
