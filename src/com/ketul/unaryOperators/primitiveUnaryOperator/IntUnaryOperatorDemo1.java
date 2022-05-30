package com.ketul.unaryOperators.primitiveUnaryOperator;

import java.util.function.IntUnaryOperator;

public class IntUnaryOperatorDemo1 {
    public static void main(String[] args) {
        IntUnaryOperator calculateSquare = num -> num * num;
        System.out.println(calculateSquare.applyAsInt(20));
    }
}
