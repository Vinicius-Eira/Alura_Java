package modelos_exercicio8;

public class ContaBancaria {

    protected double saldo;

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void sacar(double valor) {
        if (valor >= saldo) {
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para saque!");
        }

    }
    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }
}
