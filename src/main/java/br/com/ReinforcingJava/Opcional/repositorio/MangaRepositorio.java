package br.com.ReinforcingJava.Opcional.repositorio;

import br.com.ReinforcingJava.Opcional.dominio.MangaOpctional;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepositorio {
    private static List<MangaOpctional> lista = List.of(new MangaOpctional(1,"One piece",1070),new MangaOpctional(2,"Boruto",430),new MangaOpctional(1,"One punch",60));

    public static Optional<MangaOpctional> findById(Integer id){
        return findBy(m -> m.getId().equals(id));
    }



    public static Optional<MangaOpctional> findByTitulo(String title){
        return findBy(m -> m.getTitulo().equals(title));
    }


    public static Optional<MangaOpctional> findBy(Predicate<MangaOpctional> predicate){
        MangaOpctional found = null;
        for (MangaOpctional mangaOpctional : lista){
            if (predicate.test(mangaOpctional)){
                found = mangaOpctional;
            }
        }
        return Optional.ofNullable(found);
    }

}
