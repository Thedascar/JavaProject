package br.com.BaseJava.JavaOOP.ClasseProduto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto("IPHONE 11 ",3879.89);
        Produto p2 = new Produto();

        double descontoP1 = p1.descontoProduto();


        p2.nome = "Notebook Samsung";
        p2.preco = 3079.87;
        double descontoP2 = p2.descontoProduto();

        var mediaCarrinho = (descontoP1 + descontoP2) / 2;

        System.out.printf("O produto %s custou %.2f e ficou %.2f com desconto\n",p1.nome,p1.preco,descontoP1);
        System.out.printf("O produto %s custou %.2f e ficou %.2f com desconto\n",p2.nome,p2.preco,descontoP2);
        System.out.printf("Á média do seu carrinho foi de : %.2f\n",mediaCarrinho);
    }
}
