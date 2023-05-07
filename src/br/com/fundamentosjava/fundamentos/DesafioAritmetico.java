package br.com.fundamentosjava.fundamentos;

public class DesafioAritmetico {
    public static void main(String[] args) {
        // math.pow() <<< (cast)
        // math.sqrt() <<<

        double a = Math.pow(6 * (3 + 2),2);
        double b = 3 * 2;

        double c = Math.pow(((1 - 5) * (2 - 7) / 2),2);
        double d = Math.pow(10,3);

        double res = Math.pow(a / b - c,3) / d;

        System.out.println(res);
    }
}
