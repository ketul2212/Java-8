package com.ketul.functions.primitiveFunctions.type3;

import java.util.function.ToDoubleFunction;

public class ToDoubleFunctionDemo1 {
    public static void main(String[] args) {
        ToDoubleFunction<Integer> f = Math::sqrt;
        System.out.println(f.applyAsDouble(5));
    }
}
