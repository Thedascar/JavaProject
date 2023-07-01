package br.com.Deitel.cap2.exercicios;

public class Exercicio10 {
    public static void main(String[] args) {
        Integer n = 8945;
        String z = n.toString();
        if(z.length() >= 5){
            int a = n / 10000;
            int a2 = n % 10000;
            System.out.print(a + "  ");
            if(a2 != 0){
                int b = a2 / 1000;
                int b2 = a2 % 1000;
                System.out.print(b + "  ");
                if(b2 != 0){
                    int c = b2 / 100;
                    int c2 = b2 % 100;
                    System.out.print(c + "  ");
                    if(c2 != 0){
                        int d = b2 / 100;
                        int d2 = b2 % 100;
                        System.out.print(d + "  ");
                        if(d2 != 0){
                            int e = d2 / 10;
                            int e2 = d2 % 10;
                            System.out.print(e2);
                        }
                    }

                }
            }
        }else{
            System.out.println("Mínimo 5 dígitos");
        }
    }
}

