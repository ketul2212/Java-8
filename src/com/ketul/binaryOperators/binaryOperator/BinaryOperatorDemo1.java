package com.ketul.binaryOperators.binaryOperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo1 {
    public static void main(String[] args) {
        BinaryOperator<Integer> addTwoNumbers = (num1, num2) -> num1 + num2;
        System.out.println(addTwoNumbers.apply(10, 20));
    }
}
