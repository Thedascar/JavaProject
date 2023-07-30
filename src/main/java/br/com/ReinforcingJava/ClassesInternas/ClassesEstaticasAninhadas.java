package br.com.ReinforcingJava.ClassesInternas;



public class ClassesEstaticasAninhadas {
    private String name = "Lucas";
    static class Dentro{
        void print(){
            System.out.println(new ClassesEstaticasAninhadas().name);
        }
    }

    public static void main(String[] args) {
        Dentro dentro = new Dentro();
        dentro.print();
    }
}
