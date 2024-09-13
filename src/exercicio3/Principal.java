package exercicio3;

public class Principal {
    public static void main(String[] args) {

        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Nightcrawler";
        minhaMusica.artista = "Travis Scott";
        minhaMusica.anoDeLancamento = 2015;

        minhaMusica.exibaFichaTecnica();
        minhaMusica.avalia(10);
        minhaMusica.avalia(8.6);
        minhaMusica.avalia(9.6);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("A média das notas é: " + mediaAvaliacoes);
    }
}
