package br.com.fundamentosjava.JavaOOP.ClasseData;

public class DataTeste  {
    public static void main(String[] args) {
        Data d1 = new Data();
        int d = d1.dia = 11;
        int m = d1.mes = 1;
        int ano = d1.ano = 1995;

        d1.defineData();
    }
}
