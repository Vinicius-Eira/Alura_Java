package Principal;

import Modelos.Filme;
import Modelos.Serie;
import Modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("Matrix", 1999);
        favorito.avalia(9);
        var filmeDoVini = new Filme("O Regresso", 2015);
        filmeDoVini.avalia(7);
        Filme meufilme = new Filme("Deadpool", 2024);
        meufilme.avalia(10);
        Serie lost = new Serie("LOST",2000);


        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoVini);
        lista.add(meufilme);
        lista.add(favorito);
        lista.add(lost);

        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificacao() > 2) {
            System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("João");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Glauber");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println();
        Collections.sort(lista);
        System.out.println("Lista de títulos ordenados: " + lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: " + lista);
    }
}
