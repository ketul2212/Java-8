package com.ketul.functions.function;

import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<String, Integer> getStringLength = s -> s.length();
        System.out.println(getStringLength.apply("Ketul"));


    }
}
