package br.com.ReinforcingJava.Exceptions.runtimetest;

public class RuntimeException02 {
    public static void main(String[] args) {

        System.out.println(div(2,0));

    }
    private static int div(int a, int b){
      if(b == 0){
          throw  new IllegalArgumentException("Loquio");
      }
      return a / b;

   }
}
