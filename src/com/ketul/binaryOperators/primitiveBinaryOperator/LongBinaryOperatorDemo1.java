package com.ketul.binaryOperators.primitiveBinaryOperator;

import java.util.function.LongBinaryOperator;

public class LongBinaryOperatorDemo1 {
    public static void main(String[] args) {
        LongBinaryOperator addTwo = (num1, num2) -> num1 + num2;
        System.out.println(addTwo.applyAsLong(1, 2));
    }
}
