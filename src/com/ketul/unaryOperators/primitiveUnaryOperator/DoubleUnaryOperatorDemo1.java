package com.ketul.unaryOperators.primitiveUnaryOperator;

import java.util.function.DoubleUnaryOperator;

public class DoubleUnaryOperatorDemo1 {
    public static void main(String[] args) {
        DoubleUnaryOperator addSome = num -> num + 100.25;
        System.out.println(addSome.applyAsDouble(15.24));
    }
}
