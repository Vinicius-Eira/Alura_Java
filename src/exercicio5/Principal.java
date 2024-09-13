package exercicio5;

public class Principal {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.nome = "Vinícius";
        aluno1.idade = 18;

        aluno1.exibirInformacoes();

        System.out.println("O aluno " + aluno1.nome + " tem " + aluno1.idade + " anos.");
    }
}
