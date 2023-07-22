package br.com.ReinforcingJava.Utilitarias.String;

public class StringTeste03 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(100000);
        long fim = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (fim - inicio) + "ms");

        System.out.println("----------------------------------------");

        long inicio2 = System.currentTimeMillis();
        concatStringBuilder(100000);
        long fim2 = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (fim2 - inicio2) + "ms");

        System.out.println("----------------------------------------");

        long inicio3 = System.currentTimeMillis();
        concatStringBuffer(100000);
        long fim3 = System.currentTimeMillis();

        System.out.println("Tempo gasto: " + (fim3 - inicio3) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
