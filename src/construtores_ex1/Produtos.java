package construtores_ex1;

import java.util.ArrayList;

public class Produtos {
    private String nome;
    private double preco;
    private int quantidade;

    @Override
    public String toString() {
        return "Produto [nome = " + nome + ", preço = " + preco + ", quantidade = " + quantidade + "]";    }

    public Produtos(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public static void main(String[] args) {

    ArrayList<Produtos> listaProdutos = new ArrayList<>();

    Produtos produto1 = new Produtos("Celular", 2500, 1);
    Produtos produto2 = new Produtos("Notebook", 3500, 2);

    listaProdutos.add(produto1);
    listaProdutos.add(produto2);

        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

    Produtos novoProduto = new Produtos("TV", 2460, 1);
        System.out.println(novoProduto);
    }
}
