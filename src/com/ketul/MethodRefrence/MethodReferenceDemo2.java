package com.ketul.MethodRefrence;

import com.ketul.FunctionalInterface.InterfDemo4;

import java.util.function.Function;

public class MethodReferenceDemo2 {
    private String s;

    MethodReferenceDemo2(String s) {
        this.s = s;
        System.out.println("Constructor is executed.---> " + this.s);
    }

    public String getS() {
        return s;
    }

    public static void main(String[] args) {
        Function<String, MethodReferenceDemo2> f = MethodReferenceDemo2::new;
        MethodReferenceDemo2 methodReferenceDemo2_1 = f.apply("I'm Function Functional(I)");
        System.out.println(methodReferenceDemo2_1.getS());

        InterfDemo4 interfDemo4 = MethodReferenceDemo2::new;
        MethodReferenceDemo2 methodReferenceDemo2_2 = interfDemo4.m1("Hello World!...");
        System.out.println(methodReferenceDemo2_2.getS());
    }
}
