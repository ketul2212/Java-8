package com.ketul.functions.primitiveFunctions.type4;

import java.util.function.ToIntBiFunction;

public class ToIntBiFunctionDemo1 {
    public static void main(String[] args) {
        ToIntBiFunction<Integer, Integer> f = (num1, num2) -> num1 + num2;
        System.out.println(f.applyAsInt(10, 20));
    }
}
