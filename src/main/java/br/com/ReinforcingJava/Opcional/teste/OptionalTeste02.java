package br.com.ReinforcingJava.Opcional.teste;


import br.com.ReinforcingJava.Opcional.dominio.MangaOpctional;
import br.com.ReinforcingJava.Opcional.repositorio.MangaRepositorio;

import java.util.Optional;

public class OptionalTeste02 {
    public static void main(String[] args) {


        Optional<MangaOpctional> mangaTitle = MangaRepositorio.
                findByTitulo("One piece");
        mangaTitle.ifPresent(m -> m.setTitulo("One piece o melhor"));
        System.out.println(mangaTitle);


        MangaOpctional mangaId = MangaRepositorio.findById(2)
                .orElseThrow(IllegalAccessError::new);


        MangaOpctional a = MangaRepositorio.findByTitulo("Ua")
                .orElseGet(() -> new MangaOpctional(5,"Ua",20));

        System.out.println(a);

    }
}
