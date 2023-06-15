package br.com.fundamentosjava.Fundamentos;

public class DesafioVariaveis {
    public static void main(String[] args) {
        double farhenhinte = 94.89;
        final double CELSIUS = (farhenhinte - 32) * (5.0/9.0);

        System.out.println("Temos "+ farhenhinte + " Fº ");
        System.out.println("Convertido para celcius fica " + CELSIUS + " Cº");
    }
}
