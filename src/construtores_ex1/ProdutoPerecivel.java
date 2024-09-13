package construtores_ex1;

public class ProdutoPerecivel extends Produtos{
     String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
    public static void main(String[] args) {
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Hamburguer", 40, 1,"02/06/2024");
        System.out.println(produtoPerecivel);
    }
}
