package br.com.Deitel.cap3.ex01;

public class TesteConta {
    public static void main(String[] args) {

        Conta c1 = new Conta("Lucas",50.00);
        Conta c2 = new Conta("Aline",100.00);

        c1.setSaldo(100);
        c1.setSaque(50);
        c1.setSaque(-40);
        System.out.println("Conta: " + c1.getNome());
        System.out.println("Saldo: " + c1.getSaldo());
        c1.display(c1);

        c2.setSaldo(-50);
        c2.setSaque(90);
        c2.setSaque(-500);
        c2.display(c2);

    }
}
