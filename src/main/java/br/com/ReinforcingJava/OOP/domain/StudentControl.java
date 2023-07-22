package br.com.ReinforcingJava.OOP.domain;

public class StudentControl {

    public void printStudent(Student student){
        System.out.printf("Hy my name is %s and i have %d , my new class is %s \n",
                student.getName(),student.getAge(),student.getClas());
    }

}
