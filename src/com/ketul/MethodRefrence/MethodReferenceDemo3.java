package com.ketul.MethodRefrence;

import com.ketul.FunctionalInterface.InterfDemo1;

public class MethodReferenceDemo3 {
    public static void print() {
        System.out.println("Hello!...");
    }
    public static void main(String[] args) {
        InterfDemo1 methodReference = MethodReferenceDemo3::print;
        methodReference.m1();
    }
}
