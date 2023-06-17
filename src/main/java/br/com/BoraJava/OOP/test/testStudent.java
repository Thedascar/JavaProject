package br.com.BoraJava.OOP.test;

import br.com.BoraJava.OOP.domain.Student;
import br.com.BoraJava.OOP.domain.StudentControl;

public class testStudent {
    public static void main(String[] args) {

        StudentControl printer = new StudentControl();

        Student a1 = new Student("Lucas",28,"class-a");
        Student a2 = new Student("Aline",26,"class-n");
        Student a3 = new Student("Bacon",8,"class-u");
        Student a4 = new Student("Bob",4,"class-z");


        printer.printStudent(a1);
        printer.printStudent(a2);
        printer.printStudent(a3);
        printer.printStudent(a4);
    }
}
