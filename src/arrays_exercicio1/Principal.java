package arrays_exercicio1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

    Pessoa pessoa1 = new Pessoa("Murilo", 17);
    Pessoa pessoa2 = new Pessoa("Bruno", 18);
    Pessoa pessoa3 = new Pessoa("Phil", 37);

    listaDePessoas.add(pessoa1);
    listaDePessoas.add(pessoa2);
    listaDePessoas.add(pessoa3);

    System.out.println("Tamanho da lista " + listaDePessoas.size());
        System.out.println("Primeira Pessoa: " + listaDePessoas.get(0));

        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }

}
