package modelos_exercicio1;

public class Principal_ex1 {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(354);
        conta.setSaldo(1000);
        conta.titular = "Vinícius";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo disponível: " + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(2000);
        System.out.println("Saldo atual: " + conta.getSaldo());
    }
}
