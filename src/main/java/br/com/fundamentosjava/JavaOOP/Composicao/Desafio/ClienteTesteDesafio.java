package br.com.fundamentosjava.JavaOOP.Composicao.Desafio;


public class ClienteTesteDesafio {
    public static void main(String[] args) {

        ClienteDesafio p1 = new ClienteDesafio("Lucas");

        CompraDesafio compra1 = new CompraDesafio();
        compra1.addItem(new ItemDesafio(new ProdutoDesafio(4000.00,"Notebook",5)));
        compra1.addItem(new ItemDesafio(new ProdutoDesafio(2500.00,"Celular",1)));
        compra1.addItem(new ItemDesafio(new ProdutoDesafio(200.00,"Tablet",10)));

        p1.addCompra(compra1);


        System.out.println("O valor total da compra foi de R$: " + p1.compra.get(0).obterValortotal());

    }
}
