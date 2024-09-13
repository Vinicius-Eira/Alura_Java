package modelos_exercicio6;

public class Teste {
    public static void main(String[] args) {

        ModeloCarro meucarro = new ModeloCarro();

        meucarro.definirModelo("Voyage");
        meucarro.definirPreco(250000, 140000, 500000);
        meucarro.exibirInformacoes();
        meucarro.fazerBarulho();


    }
}
