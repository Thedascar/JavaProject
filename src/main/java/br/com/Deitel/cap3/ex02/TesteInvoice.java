package br.com.Deitel.cap3.ex02;

public class TesteInvoice {
    public static void main(String[] args) {
        Invoice nota = new Invoice("4678","Notebook",10,3999.00);

        nota.imprimeInvoice();
    }
}
