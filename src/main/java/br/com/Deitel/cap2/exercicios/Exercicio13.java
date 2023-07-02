package br.com.Deitel.cap2.exercicios;

public class Exercicio13 {
    public static void main(String[] args) {

        double peso = 62;
        double altura = 1.65;

        double imc = peso / Math.pow(altura,2);

       if(imc < 17.99){
           System.out.println("Desnutrido");
       }else if(imc > 18 && imc < 24.99){
           System.out.println("Normal");
       }else if(imc > 25 && imc < 29.99){
           System.out.println("Sobrepeso");
       }else {
           System.out.println("Obeso");
       }

    }
}
