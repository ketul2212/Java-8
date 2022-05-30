package com.ketul.functions.primitiveFunctions.type2;

import java.util.function.LongToIntFunction;

public class LongToIntFunctionDemo1 {
    public static void main(String[] args) {
        LongToIntFunction f = num -> (int)num + 10;
        System.out.println(f.applyAsInt(10));
    }
}
