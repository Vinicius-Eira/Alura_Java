package modelos_exercicio5;

public class Livro {

    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhe() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}
