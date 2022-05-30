package com.ketul.lambda;

import com.ketul.FunctionalInterface.InterfDemo1;

public class LambdaDemo2 {

    private int num = 777;

    public void m2() {
        InterfDemo1 interfDemo1 = () -> {
            int num = 888;
            System.out.println(num);
            System.out.println(this.num);

            num += 10;
            System.out.println(num + "   " +  this.num);
        };
        interfDemo1.m1();
    }

    public static void main(String[] args) {
        LambdaDemo2 lambdaDemo2 = new LambdaDemo2();
        lambdaDemo2.m2();
    }
}
