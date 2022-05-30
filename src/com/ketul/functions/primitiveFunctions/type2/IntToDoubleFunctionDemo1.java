package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo1 {
    public static void main(String[] args) {
        IntToDoubleFunction f = num -> Math.sqrt(num);
        System.out.println(f.applyAsDouble(5));
        System.out.println(f.applyAsDouble(7));
    }
}
