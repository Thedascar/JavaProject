package br.com.ReinforcingJava.Utilitarias.String;

public class StringTest04 {
    public static void main(String[] args) {
        String dog = "Bacon ";
        dog = dog.concat("e Bob");
        System.out.println(dog);

       StringBuilder sb = new StringBuilder();
       sb.append("Lucas Ramon").append(" Campos");
       sb.reverse();
       sb.reverse();
       sb.delete(0,3);
        System.out.println(sb);



    }
}
