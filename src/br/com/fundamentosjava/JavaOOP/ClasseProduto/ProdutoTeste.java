package br.com.fundamentosjava.JavaOOP.ClasseProduto;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        Produto p2 = new Produto();

        p1.nome = "IPHONE 11";
        p1.preco = 3489.89;
        p1.desconto = 0.10;
        double descontoP1 = p1.descontoProduto();


        p2.nome = "Notebook Samsung";
        p2.preco = 3079.87;
        p2.desconto = 0.05;
        double descontoP2 = p2.descontoProduto();

        var mediaCarrinho = (descontoP1 + descontoP2) / 2;

        System.out.printf("O produto %s custou %.2f e ficou %.2f com desconto\n",p1.nome,p1.preco,descontoP1);
        System.out.printf("O produto %s custou %.2f e ficou %.2f com desconto\n",p2.nome,p2.preco,descontoP2);
        System.out.printf("Á média do seu carrinho foi de : %.2f\n",mediaCarrinho);
    }
}
