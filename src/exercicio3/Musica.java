package exercicio3;

public class Musica {

    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibaFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
