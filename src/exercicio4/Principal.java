package exercicio4;

public class Principal {
    public static void main(String[] args) {

    Carro meuCarro = new Carro();

    meuCarro.modelo = "Mercedes";
    meuCarro.ano = 2006;
    meuCarro.cor = "Preta";

    meuCarro.exibaFichaTecnica();

        System.out.println("Idade do carro " + meuCarro.calculaIdade() + " anos.");
    }

}
