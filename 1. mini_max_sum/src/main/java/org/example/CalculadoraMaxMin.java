package org.example;

public class CalculadoraMaxMin {

    private int[] array;
    private int menorNumero;
    private int maiorNumero;
    private int menorSoma;
    private int maiorSoma;

    public CalculadoraMaxMin(int[] array) {
        this.array = array;
        setMenorNumero();
        setMaiorNumero();
        setMenorSoma();
        setMaiorSoma();
    }

    public void setMenorNumero() {
        menorNumero = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menorNumero) {
                menorNumero = array[i];
            }
        }
    }

    public void setMaiorNumero() {
        maiorNumero = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maiorNumero) {
                maiorNumero = array[i];
            }
        }
    }

    public void setMenorSoma() {
        for (int i = 0; i < array.length; i++) {
            menorSoma += array[i];
        }
        menorSoma -= maiorNumero;
    }

    public void setMaiorSoma() {
        for (int i = 0; i < array.length; i++) {
            maiorSoma += array[i];
        }
        maiorSoma -= menorNumero;
    }

    @Override
    public String toString() {
        return menorSoma + " " + maiorSoma;
    }
}
