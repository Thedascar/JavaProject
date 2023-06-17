package br.com.BoraJava.OOP.domain;

public class Employeer {
    private String name;
    private int age;
    private double salary;

    public Employeer() {
    }

    public Employeer(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public void printEmployeer(String name,int age,double... salary){
        double total = 0;
        for (double s : salary){
            total += s;
        }
        double avg = total / salary.length;

        System.out.printf("My name is %s and im %d , my average payment is R$: %.2f \n",name,age,avg);
    }
}
