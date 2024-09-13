package Calculos;

import Modelos.Filme;

public class FiltroRecomendacao {
    private String recomendacao;

    public void filtra(Classificar classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Esta entre os preferidos!");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Esta entre os melhores avaliados");
        } else {
            System.out.println("Coloque na sua lista para ver depois");
        }
    }
}
