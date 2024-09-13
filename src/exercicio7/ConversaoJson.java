package exercicio7;

import com.google.gson.Gson;

public class ConversaoJson {
    public static void main(String[] args) {

        String json = "{\"titulo\":\"Harry Potter\",\"autor\":\"Luzia\",\"" +
                     "editora\":{\"nome\":\"TechBooks\",\"localização\":\"São Paulo\"}}";

        Gson gson = new Gson();

        Livro livro = gson.fromJson(json, Livro.class);
        System.out.println(livro);
    }
}
