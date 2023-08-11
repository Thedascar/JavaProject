package br.com.ReinforcingJava.Threads.teste;

class Exemplo extends Thread implements Runnable {
    private final char c;

    public Exemplo(char c) {
        this.c = c;
    }


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Nova extends Thread{
    private final char c;

    public Nova(char c) {
        this.c = c;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 1000; i++) {
            System.out.print(c);
            if(i % 100 == 0){
                System.out.println();
            }
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadTest01 {
    public static void main(String[] args) {

        /*
        Nova nova = new Nova('L');
        Nova nova2 = new Nova('U');
        Nova nova3 = new Nova('C');
        Nova nova4 = new Nova('A');
        Nova nova5 = new Nova('S');

        nova.start();
        nova2.start();
        nova3.start();
        nova4.start();
        nova5.start();



        System.out.println("-----------------------------------");
*/

        Thread a1 = new Exemplo('L');
        Thread a2 = new Exemplo('U');
        Thread a3 = new Exemplo('C');
        Thread a4 = new Exemplo('A');
        Thread a5 = new Exemplo('S');

        a4.getPriority();

        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
