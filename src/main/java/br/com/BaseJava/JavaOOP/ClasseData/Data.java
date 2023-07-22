package br.com.BaseJava.JavaOOP.ClasseData;
public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        this.dia = 1;
        this.mes = 1;
        this.ano = 1970;
    }
    Data(int dia,int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
     void defineData(){
        System.out.println("A data é: " + dia + "/" + mes + "/" + ano);
     }
}