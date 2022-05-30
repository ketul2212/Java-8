package com.ketul.functions.function;

import java.util.function.Function;

public class FunctionDemo2 {
    public static void main(String[] args) {
        Function<Integer, Integer> add = a -> a + 3;
        Function<Integer, Integer> multiply = a -> a * 10;

        Function<Integer, Integer> main1 = multiply.compose(add);
        Function<Integer, Integer> main2 = multiply.andThen(add);

        System.out.println(main1.apply(19));
        System.out.println(main2.apply(19));
    }
}
