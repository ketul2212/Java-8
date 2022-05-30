package com.ketul.unaryOperators.primitiveUnaryOperator;

import java.util.function.LongUnaryOperator;

public class LongUnaryOperatorDemo1 {
    public static void main(String[] args) {
        LongUnaryOperator add10 = num -> num + 10;
        System.out.println(add10.applyAsLong(10l));
    }
}
