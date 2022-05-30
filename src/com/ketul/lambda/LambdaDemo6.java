package com.ketul.lambda;

public class LambdaDemo6 {
    public static void main(String[] args) {
        Runnable r = () -> {
                for(int i = 0; i < 10; i++)
                    System.out.println("I'm Child Thread with Lambda");
        };
        Thread t = new Thread(r);
        t.start();
        for(int i = 0; i < 10; i++)
            System.out.println("I'm Main Thread with Lambda");
    }
}
