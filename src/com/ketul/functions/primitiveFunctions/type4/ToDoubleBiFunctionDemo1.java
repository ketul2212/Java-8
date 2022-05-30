package com.ketul.functions.primitiveFunctions.type4;

import java.util.function.ToDoubleBiFunction;

public class ToDoubleBiFunctionDemo1 {
    public static void main(String[] args) {
        ToDoubleBiFunction<Integer, Integer> f = (num1, num2) -> Math.sqrt(num1 + num2);
        System.out.println(f.applyAsDouble(10, 20));
    }
}
