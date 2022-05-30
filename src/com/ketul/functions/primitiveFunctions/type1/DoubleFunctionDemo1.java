package com.ketul.functions.primitiveFunctions.type1;

import java.util.function.DoubleFunction;

public class DoubleFunctionDemo1 {
    public static void main(String[] args) {
        DoubleFunction<Integer> f = num -> (int)num;
        System.out.println(f.apply(13.4));
        System.out.println(f.apply(16.7));
    }
}
