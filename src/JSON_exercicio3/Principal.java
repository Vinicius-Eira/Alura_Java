package JSON_exercicio3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {

    public static void main(String[] args) {

        Veiculo veiculo = new Veiculo("toyota","Corolla", 2022,  12000.000);

        Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
        String jsonPretty = gsonPretty.toJson(veiculo);

        System.out.println(jsonPretty);
    }
}
