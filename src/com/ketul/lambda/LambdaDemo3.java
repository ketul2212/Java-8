package com.ketul.lambda;

import com.ketul.FunctionalInterface.InterfDemo1;

public class LambdaDemo3 {

    private int num = 777;

    public void m2() {
        int x = 888;
        InterfDemo1 interfDemo1 = () -> {
            System.out.println(x); // 888
            System.out.println(this.num); // 777

//            x += 10;  // CE:- local variables referenced from a lambda expression must be final or effectively final
            System.out.println(x + "   " +  this.num);  // 888   777
        };
        interfDemo1.m1();
    }

    public static void main(String[] args) {
        LambdaDemo3 lambdaDemo3 = new LambdaDemo3();
        lambdaDemo3.m2();
    }
}
