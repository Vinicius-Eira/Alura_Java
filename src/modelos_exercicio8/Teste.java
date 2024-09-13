package modelos_exercicio8;

public class Teste {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(2000);
        System.out.println();

        ContaCorrente minhaContaCorrente = new ContaCorrente();
        minhaContaCorrente.depositar(100);
        minhaContaCorrente.cobrarTarifaMensal();
        System.out.println();
        minhaContaCorrente.sacar(200);
        minhaContaCorrente.verificarSaldo();

    }
}
