package org.example;

import java.util.List;

public class Result {

    private List<Integer> arr;
    private Double quantidadePositivo = 0.0;
    private Double quantidadeNegativo = 0.0;
    private Double quantidadeZero = 0.0;
    private Double proporcaoPositivo;
    private Double proporcaoNegativo;
    private Double proporcaoZero;


    public Result(List<Integer> arr) {
        this.arr = arr;
        setQuantidade();
        setProporcao();
    }

    public void setQuantidade() {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                quantidadePositivo++;
            } else if (arr.get(i) < 0) {
                quantidadeNegativo++;
            } else {
                quantidadeZero++;
            }
        }
    }

    public void setProporcao() {
        proporcaoPositivo = quantidadePositivo / arr.size();
        proporcaoNegativo = quantidadeNegativo / arr.size();
        proporcaoZero = quantidadeZero / arr.size();
    }

    public void imprimeProporcoes() {
        System.out.printf("%.6f\n", proporcaoPositivo);
        System.out.printf("%.6f\n",proporcaoNegativo);
        System.out.printf("%.6f", proporcaoZero);
    }

}


