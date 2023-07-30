package br.com.ReinforcingJava.ClassesInternas;

public class ClassesDeForaTeste02 {
    private String nome = "Lucas";

    void print(){
        class Local{
            public void printLocal(){
                System.out.println(nome);
            }
        }
        Local local = new Local();
        local.printLocal();
    }

    public static void main(String[] args) {

        ClassesDeForaTeste02 classesDeForaTeste02 = new ClassesDeForaTeste02();


    }
}
