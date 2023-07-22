package br.com.BaseJava.ErrosExecoes;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {

        try{
            geraError1();
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try{
            geraError2();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }



        System.out.println("aa");
    }

    // não checada ou nao verifica
    static void geraError1(){
        throw new RuntimeException("A fudeo erro 1");
    }


    // checada
    static void geraError2() throws Exception {
      try {
          throw new Exception("erro ahhh 2");
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
    }
}
