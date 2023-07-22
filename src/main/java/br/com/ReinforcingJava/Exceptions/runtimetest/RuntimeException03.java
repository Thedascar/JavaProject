package br.com.ReinforcingJava.Exceptions.runtimetest;

public class RuntimeException03 {
    public static void main(String[] args) {
        abreConexao();
   }
   private static String abreConexao(){
       try{
           System.out.println("Abrindo arquivo");
           System.out.println("Escrevebdo");
           System.out.println("Fechando o arquivo");
       }catch (Exception e){
           System.out.println("fechamento de recurso !!!!");
           e.getStackTrace();
       }finally{
           System.out.println("finalizou");
       }
       return null;
   }
}

