package br.com.fundamentosjava.Streams.DesafioStreamFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterStream {
    public static void main(String[] args) {


        Carro  c1 = new Carro("Porche",true,540.187);
        Carro  c2 = new Carro("Ferrari",true,850.687);
        Carro  c3 = new Carro("gol",false,36.850);
        Carro  c4 = new Carro("palio",false,28.100);
        Carro  c5 = new Carro("fusca",false,10.280);
        Carro  c6 = new Carro("Corvette",true,1068.687);
        Carro  c7 = new Carro("s10",false,123.657);


        List<Carro> listCar = Arrays.asList(c1,c2,c3,c4,c5,c6,c7);

        Consumer<Carro> fala = a -> System.out.printf(" %s é esportido e custa R$ %.3f \n",a.modelo,a.valor).toString();

        listCar.stream()
                .filter(d -> d.isEsportivo == true)
                .filter(e -> e.valor > 250.000)
                .forEach(fala);
    }

}
