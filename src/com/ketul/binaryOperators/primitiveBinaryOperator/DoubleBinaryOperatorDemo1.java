package com.ketul.binaryOperators.primitiveBinaryOperator;

import java.util.function.DoubleBinaryOperator;

public class DoubleBinaryOperatorDemo1 {
    public static void main(String[] args) {
        DoubleBinaryOperator multiplyTwo = (num1, num2) -> num1 * num2;
        System.out.println(multiplyTwo.applyAsDouble(13.2, 12.6));
    }
}
