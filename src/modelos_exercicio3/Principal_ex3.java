package modelos_exercicio3;

public class Principal_ex3 {
    public static void main(String[] args) {

        Produto produto = new Produto(); // Produto produto = new Produto("Celular", 2000.0);
                                         // para facilitar
        produto.setNome("Celular");
        produto.setPreco(2500);

        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("O novo valor com desconto do produto é de: " + produto.getPreco());
    }
}
