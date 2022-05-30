package com.ketul.binaryOperators.primitiveBinaryOperator;

import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo1 {
    public static void main(String[] args) {
        IntBinaryOperator addTwo = (num1, num2) -> num1 + num2;
        System.out.println(addTwo.applyAsInt(20, 30));
    }
}
