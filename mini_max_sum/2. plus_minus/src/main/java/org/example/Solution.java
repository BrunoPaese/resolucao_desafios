package org.example;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-4);
        arr.add(3);
        arr.add(-9);
        arr.add(0);
        arr.add(4);
        arr.add(1);

        Result result = new Result(arr);
        result.imprimeProporcoes();
    }
}
