package br.com.ReinforcingJava.ClassesInternas;

public class ClassesInternasTest01 {
    private String nome = "Lucas";

    class ClasseInternaDeDentro{
        public void print(){
            System.out.println(nome);
        }
    }

    public static void main(String[] args) {

        ClassesInternasTest01 classesInternasTest01 = new ClassesInternasTest01();
        ClasseInternaDeDentro classeInternaDeDentro = classesInternasTest01.new ClasseInternaDeDentro();
        classeInternaDeDentro.print();

    }
}
