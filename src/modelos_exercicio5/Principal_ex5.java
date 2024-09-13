package modelos_exercicio5;

public class Principal_ex5 {

    public static void main(String[] args) {

        Livro livro1 = new Livro();

        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhe();
        System.out.println();
        livro2.exibirDetalhe();

    }
}
