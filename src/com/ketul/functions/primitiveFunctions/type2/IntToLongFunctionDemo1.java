package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionDemo1 {
    public static void main(String[] args) {
        IntToLongFunction f = num -> num + 10;
        System.out.println(f.applyAsLong(10));
    }
}
