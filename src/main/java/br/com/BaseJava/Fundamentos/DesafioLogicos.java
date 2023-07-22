package br.com.BaseJava.Fundamentos;

public class DesafioLogicos {
    public static void main(String[] args) {
        // trabalho na terça
        // trabalho na quinta

        // se v comprar 1 tv 50
        // apenas 1 tv 32

        // todos vao tomar sorvete
        // se anda deu certo ngm toma sorvete

        boolean isWorkatTuesday = true;
        boolean isWorkAtThursday = false;

        boolean buyTv55 = isWorkatTuesday && isWorkAtThursday;
        boolean buyTv32 = isWorkatTuesday ^ isWorkAtThursday;

        boolean iceCream = buyTv55 || buyTv32;
        boolean anything = !buyTv55 && !buyTv32;

        System.out.println("Comprou a tv de 50 : " + buyTv55);
        System.out.println("Comprou a tv de 32 : " + buyTv32);
        System.out.println("Familia tomou sorvete: " + iceCream);
        System.out.println("Tudo deu errado: " + anything);
    }
}
