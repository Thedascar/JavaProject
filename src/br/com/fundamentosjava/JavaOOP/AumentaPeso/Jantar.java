package br.com.fundamentosjava.JavaOOP.AumentaPeso;

public class Jantar {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas",82);
        Comida c1 = new Comida("Hamburguer",0.500);
        Comida c2 = new Comida("Pizza Big",0.500);
        Comida c3 = new Comida("Feijoada",1.000);

        p1.comer(p1,c1);
        p1.comer(p1,c2);
        p1.comer(p1,c3);
    }
}
