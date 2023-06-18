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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployeer(String name, int age, double... salary){
        double total = 0;

        if(name != null && name != "" && age > 0){
            for (double b: salary){
                if(b > 0){
                    total += b;
                }else{
                   return;
                }
            }
        }else{
            System.out.println("Algo deu errado");
            return;
        }
        double avg = total / salary.length;
        System.out.printf("My name is %s and im %d , my average payment is R$: %.2f \n",name,age,avg);
    }
  }


