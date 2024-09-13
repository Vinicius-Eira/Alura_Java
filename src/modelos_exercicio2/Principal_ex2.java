package modelos_exercicio2;

public class Principal_ex2 {

    public static void main(String[] args) {

        IdadePessoa pessoa1 = new IdadePessoa();

        pessoa1.setNome("Clara");
        pessoa1.setIdade(23);

        IdadePessoa pessoa2 = new IdadePessoa();

        pessoa2.setNome("Lorena");
        pessoa2.setIdade(16);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos");
        pessoa2.verificarIdade();


    }
}
