package br.com.ReinforcingJava.Collections.teste;

import br.com.ReinforcingJava.Collections.dominio.CellPhone;

public class EqualsTest01 {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone("ASZ45","IPhone");
        CellPhone cellPhone2 = new CellPhone("ASZ4555","IPhone");

        System.out.println(cellPhone1.hashCode());
        System.out.println(cellPhone2.hashCode());
        System.out.println(cellPhone1.equals(cellPhone2));

    }
}
