package br.com.BaseJava.JavaOOP.Composicao.UmParaMuitos;
public class CompraTeste {
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.adicionarItem("Celular",2,2878.79);
        c1.adicionarItem(new Item("Acessorios",2,287.97));
        c1.adicionarItem("Carro",1,22587.36);

        System.out.println(c1.itens.size());

        System.out.println(c1.valorTotal());
    }
}
