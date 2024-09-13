package interface_ex2;

public class CalculadoraSalaRetangular implements CalculoGeometrico{
    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("O cálculo da área é de: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
       double perimetro = 2 * (altura + largura);
        System.out.println("O calcúlo do perímetro é de: " + perimetro);
    }
}
