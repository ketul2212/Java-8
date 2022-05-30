package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.DoubleToLongFunction;

public class DoubleToLongFunctionDemo1 {
    public static void main(String[] args) {
        DoubleToLongFunction f = num -> (long)(num * num);
        System.out.println(f.applyAsLong(10.325));
    }
}
