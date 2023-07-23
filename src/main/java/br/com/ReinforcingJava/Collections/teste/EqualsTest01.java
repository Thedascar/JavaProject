package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.SmartPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        SmartPhone smartPhone1 = new SmartPhone("ASZ45","IPhone");
        SmartPhone smartPhone2 = new SmartPhone("ASZ4555","IPhone");

        System.out.println(smartPhone1.hashCode());
        System.out.println(smartPhone2.hashCode());
        System.out.println(smartPhone1.equals(smartPhone2));

    }
}
