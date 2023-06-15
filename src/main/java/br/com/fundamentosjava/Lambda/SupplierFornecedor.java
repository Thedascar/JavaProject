package br.com.fundamentosjava.Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierFornecedor {
    public static void main(String[] args) {

        Supplier<  List<String>  > umalIsta = () -> Arrays.asList("lucas","bacon","bob","aline");
        System.out.println(umalIsta.get());
    }
}
