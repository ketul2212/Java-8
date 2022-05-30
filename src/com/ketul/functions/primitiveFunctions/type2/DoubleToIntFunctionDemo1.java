package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.DoubleToIntFunction;

public class DoubleToIntFunctionDemo1 {
    public static void main(String[] args) {
        DoubleToIntFunction f = num -> (int) (num * num);
        System.out.println(f.applyAsInt(15.5));
    }
}
