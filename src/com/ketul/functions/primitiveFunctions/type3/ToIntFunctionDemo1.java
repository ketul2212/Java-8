package com.ketul.functions.primitiveFunctions.type3;

import java.util.function.ToIntFunction;

public class ToIntFunctionDemo1 {
    public static void main(String[] args) {
        ToIntFunction<String> f = s -> s.length();
        System.out.println(f.applyAsInt("Ketul"));
    }
}
