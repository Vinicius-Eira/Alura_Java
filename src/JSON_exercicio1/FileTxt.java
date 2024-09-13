package JSON_exercicio1;

import java.io.FileWriter;
import java.io.IOException;

public class FileTxt {
    public static void main(String[] args) {

        String mensagem = "Conteúdo a ser gravado no arquivo.";

        try(FileWriter writer = new FileWriter("Arquivo txt")) {
            writer.write(mensagem);
            System.out.println("Mensagem gravada com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
