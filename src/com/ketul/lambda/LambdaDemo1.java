package com.ketul.lambda;

import com.ketul.FunctionalInterface.InterfDemo1;

public class LambdaDemo1 {
    public static void main(String[] args) {
        InterfDemo1 interfDemo1 = () -> System.out.println("Hello");
        interfDemo1.m1();
    }
}
