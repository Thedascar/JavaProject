package br.com.BaseJava.Observer.Obs01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class PorteiroSubject extends Thread{

    private List<ChegadaAniversarianteObserver> observers = new ArrayList<ChegadaAniversarianteObserver>();

    public void addChegadaAniversanteObserver(ChegadaAniversarianteObserver observer){
        this.observers.add(observer);
    }

    @Override
    public void run(){
        Scanner scanner = new Scanner(System.in);


        while(true){
            int valor = scanner.nextInt();

            if (valor == 1){
                ChegadaAniversarianteEvent event = new ChegadaAniversarianteEvent(new Date());


                for (ChegadaAniversarianteObserver observer: this.observers
                     ) {
                    observer.chegou(event);
                }

            }else{
                System.out.println("Alarme falso");
            }
        }
    }
}
