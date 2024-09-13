package modelos_exercicio4;

public class Principal_ex4 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno("Diego", 6.7, 8.5, 9.0);
        Aluno aluno2 = new Aluno("Soares", 10.0, 7.4, 4.5);

        System.out.println("ALUNO 1");
        System.out.println();
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("ALUNO 2");
        System.out.println();
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
    }
}