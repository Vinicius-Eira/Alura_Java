package JSON_exercicio2;

public class Titulo {
    private String nome;
    private String autor;
    private int ano;
    private String genero;

    public Titulo(String nome, String autor, int ano, String genero) {
        this.nome = nome;
        this.autor = autor;
        this.ano = ano;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
