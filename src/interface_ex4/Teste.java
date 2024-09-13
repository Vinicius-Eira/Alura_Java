package interface_ex4;

public class Teste {
    public static void main(String[] args) {

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();

        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversor.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + "° Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + "° Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
    }
}
