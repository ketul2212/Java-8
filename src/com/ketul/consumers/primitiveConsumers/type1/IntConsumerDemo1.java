package com.ketul.consumers.primitiveConsumers.type1;

import java.util.function.IntConsumer;

public class IntConsumerDemo1 {
    public static void main(String[] args) {
        IntConsumer printMultiply = num -> System.out.println(num * num);
        printMultiply.accept(5);
    }
}
