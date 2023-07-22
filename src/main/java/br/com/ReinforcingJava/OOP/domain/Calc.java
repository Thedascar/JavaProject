package br.com.ReinforcingJava.OOP.domain;

public class Calc {

    private double a;
    private double b;


    public Calc(){
    }

    public Calc(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void sum(){

        System.out.format("The sum of {%.2f + %.2f} = {%.2f} ",a,b, a+b);
    }

    public double sub(double a, double b){
        return a - b;
    }


    public void sumArgs(double... nums){
        double total= 0;
        for (double num: nums) {
            total += num;
        }
        System.out.println(total);
    }


    public void a(double a,double b){
        System.out.println(a + b);
    }

    public void a(String a,String b){
        System.out.println(a + b);
    }
}