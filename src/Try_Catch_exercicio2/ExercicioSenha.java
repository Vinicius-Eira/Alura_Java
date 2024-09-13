package Try_Catch_exercicio2;

import java.util.Scanner;

public class ExercicioSenha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua senha: ");String senha = scanner.nextLine();

        try {
            validarSenha(senha);
                System.out.println("Senha válida!");
            } catch (SenhaInvalidaException e) {
                System.out.println("Erro "+ e.getMessage());
            }
        }


    private static void validarSenha(String senha) {
        if(senha.length() < 8) {
            throw new SenhaInvalidaException("Senha inválida! A senha possui menos de 8 caracteres.");
        }
    }
}
