package br.com.ReinforcingJava.ClassesInternas;


class Animal{
    public void walk(){
        System.out.println("Animal");
    }
}

public class ClasseAnonima {
    public static void main(String[] args) {

        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking Blaster");
            }
        };
        animal.walk();
    }
}
