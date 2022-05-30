package com.ketul.functions.primitiveFunctions.type1;

import java.util.function.LongFunction;

public class LongFunctionDemo1 {
    public static void main(String[] args) {
        LongFunction<Integer> f = num -> Math.toIntExact(num * num);
        System.out.println(f.apply(10));
    }
}
