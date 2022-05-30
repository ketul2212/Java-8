package com.ketul.consumers.primitiveConsumers.type1;

import java.util.function.DoubleConsumer;

public class DoubleConsumerDemo1 {
    public static void main(String[] args) {
        DoubleConsumer printSqrt = num -> System.out.println(Math.sqrt(num));
        printSqrt.accept(30);
    }
}
