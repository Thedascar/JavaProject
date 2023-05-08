package br.com.fundamentosjava.JavaOOP.ClasseData;

public class DataTeste  {
    public static void main(String[] args) {
        Data d1 = new Data();
        d1.dia = "11";
        d1.mes = "Janeiro";
        d1.ano = "1995";

        System.out.printf( "Dia %s do mês de %s do ano %s",d1.dia,d1.mes,d1.ano);
    }
}
