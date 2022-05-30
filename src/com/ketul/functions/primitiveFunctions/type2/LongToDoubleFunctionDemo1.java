package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.LongToDoubleFunction;

public class LongToDoubleFunctionDemo1 {
    public static void main(String[] args) {
        LongToDoubleFunction f = num -> num * 0.24;
        System.out.println(f.applyAsDouble(12));
    }
}
