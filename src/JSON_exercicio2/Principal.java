package JSON_exercicio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {

        // Criação do objeto Titulo
        Titulo titulo = new Titulo("O Senhor dos Anéis", "J.R.R. Tolkien", 1954, "Fantasia");

        // Criação do objeto Gson
        Gson gson = new Gson();

        // Serialização do objeto Titulo para JSON
        String json = gson.toJson(titulo);

        // Impressão do JSON
        System.out.println("JSON sem formatação:");
        System.out.println(json);

        // Serialização do objeto Titulo para JSON formatado
        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String jsonPretty = gsonPretty.toJson(titulo);

        // Impressão do JSON formatado
        System.out.println();
        System.out.println("JSON formatado:");
        System.out.println(jsonPretty);
    }

}
