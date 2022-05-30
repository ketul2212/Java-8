package com.ketul.MethodRefrence;

public class MethodReferenceDemo1 {
    public static void m1() {
        for(int i = 0; i < 10; i++)
            System.out.println("Child Thread");
    }

    public static void main(String[] args) {
        Runnable r = MethodReferenceDemo1::m1;
        Thread t = new Thread(r);
        t.start();

        for(int i = 0; i < 10; i++)
            System.out.println("Main Thread");
    }
}
