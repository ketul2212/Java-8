package com.ketul.functions.primitiveFunctions.type3;

import java.util.function.ToLongFunction;

public class ToLongFunctionDemo1 {
    public static void main(String[] args) {
        ToLongFunction<String> f = String::length;
        System.out.println(f.applyAsLong("Ketul"));
    }
}
