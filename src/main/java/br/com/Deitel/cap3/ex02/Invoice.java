package br.com.Deitel.cap3.ex02;

public class Invoice {
    private String numero;
    private String descricaoItem;
    private int quantidade;
    private double precoPorItem;

    public Invoice(String numero, String descricaoItem, int quantidade, double precoPorItem) {
        this.numero = numero;
        this.descricaoItem = descricaoItem;
        this.quantidade = quantidade;
        this.precoPorItem = precoPorItem;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricaoItem;
    }

    public void setDescricao(String descricao) {
        this.descricaoItem = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }

    public void imprimeInvoice(){
        System.out.println("Número: " + numero);
        System.out.println("Descrição: " + descricaoItem);
        if(quantidade < 0.0){
            quantidade = 0;
        }else{
            System.out.println("Quantidade item: " + quantidade);
        }
        if(precoPorItem < 0.0){
            precoPorItem = 0;
        }else {
            System.out.println("Preço por item: " + precoPorItem);
        }
            System.out.println("Valor total da nota: " + precoPorItem * quantidade );
    }
}
