package com.ketul.functions.primitiveFunctions.type1;

import java.util.function.IntFunction;

public class IntFunctionDemo1 {
    public static void main(String[] args) {
        IntFunction<Integer> f = num -> num * num;
        System.out.println(f.apply(30));
    }
}
