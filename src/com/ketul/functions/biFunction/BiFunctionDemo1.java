package com.ketul.functions.biFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> bi_f = (num1, num2) -> num1 + num2;
        System.out.println(bi_f.apply(10, 20));
    }
}
