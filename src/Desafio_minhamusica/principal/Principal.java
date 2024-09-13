package Desafio_minhamusica.principal;

import Desafio_minhamusica.Minhas_Preferidas;
import Desafio_minhamusica.Musica;
import Desafio_minhamusica.Podcast;

public class Principal {
    public static void main(String[] args) {

        Musica minhamusica = new Musica();
        minhamusica.setTitulo("Superman");
        minhamusica.setCantor("Eminem");

        for (int i = 0; i < 1000; i++) {
            minhamusica.reproduzir();
        }
 
        for (int i = 0; i < 50; i++) {
            minhamusica.curtir();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setTitulo("BaconNerd");
        meupodcast.setApresentador("Miguel");

        for (int i = 0; i < 5000; i++) {
            meupodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            meupodcast.curtir();
        }

        Minhas_Preferidas preferidas = new Minhas_Preferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }
}
