package com.ketul.functions.primitiveFunctions.type4;

import java.util.function.ToLongBiFunction;

public class ToLongBiFunctionDemo1 {
    public static void main(String[] args) {
        ToLongBiFunction<Long, Long> f = (num1, num2) -> num1 + num2;
        System.out.println(f.applyAsLong(15l, 20l));
    }
}
