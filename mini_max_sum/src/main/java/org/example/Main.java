package org.example;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        CalculadoraMaxMin calculadoraMaxMin = new CalculadoraMaxMin(array);
        System.out.println(calculadoraMaxMin.toString());
    }
}