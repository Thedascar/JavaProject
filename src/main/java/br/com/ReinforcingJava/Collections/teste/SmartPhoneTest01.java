package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.SmartPhone;

import java.util.ArrayList;
import java.util.List;

public class SmartPhoneTest01 {
    public static void main(String[] args) {
        SmartPhone smartPhone1 = new SmartPhone("4958AWX","IPhone");
        SmartPhone smartPhone2 = new SmartPhone("9587FJD","Samsung");
        SmartPhone smartPhone3 = new SmartPhone("65957WE","LG");

        List<SmartPhone> smarts = new ArrayList<>();
        smarts.add(smartPhone1);
        smarts.add(smartPhone2);
        smarts.add(smartPhone3);
        smarts.add(0,smartPhone3);

        for (SmartPhone smart : smarts) {
            System.out.println(smart.getMarca());
        }

        SmartPhone smartPhone4 = new SmartPhone("9587FJD","Samsung");


        System.out.println(smarts.contains(smartPhone4));
        int index = smarts.indexOf(smartPhone4);
        System.out.println(smarts.get(index).toString());

    }
}
