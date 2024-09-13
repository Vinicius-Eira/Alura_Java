package Try_Catch_exercicio1;

import java.util.Scanner;

public class ExercicioDivisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.println("Digite o denominador: ");
        int denominador = scanner.nextInt();

        try{
            int resultado = numerador/denominador;
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("ERRO! 0 não pode ser o divisor.");
        }
    }
}
