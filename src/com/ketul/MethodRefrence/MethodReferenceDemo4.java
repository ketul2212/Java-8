package com.ketul.MethodRefrence;

import com.ketul.FunctionalInterface.InterfDemo1;

public class MethodReferenceDemo4 {
    public int getData() {
        System.out.println("I'm MethodReferenceDemo4 instance method");
        return 10;
    }

    public static void main(String[] args) {
        InterfDemo1 methodReference = new MethodReferenceDemo4()::getData;
        methodReference.m1();
    }
}
