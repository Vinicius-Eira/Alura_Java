package buscador_JSON;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ConsultaCep consultaCep = new ConsultaCep();

        System.out.println("Digite o número do CEP para consulta: ");
        var cep = leitura.nextLine();

        try {
        Endereco novoEndereco = consultaCep.buscarEndereco(cep);
        System.out.println(novoEndereco);
        GeradorArquivo gerador = new GeradorArquivo();
        gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação.");
        }
    }
}
