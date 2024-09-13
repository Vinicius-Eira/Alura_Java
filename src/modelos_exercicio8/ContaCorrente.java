package modelos_exercicio8;

public class ContaCorrente extends ContaBancaria{

    private double tarifaMensal;

        public void cobrarTarifaMensal() {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada.");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }

