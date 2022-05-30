package com.ketul.unaryOperators.unaryOperator;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {
    public static void main(String[] args) {
        UnaryOperator<Integer> calculateSquare = num -> num * num;
        System.out.println(calculateSquare.apply(10));
    }
}
