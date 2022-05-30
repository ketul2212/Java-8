package com.ketul.consumers.primitiveConsumers.type1;

import java.util.function.LongConsumer;

public class LongConsumerDemo1 {
    public static void main(String[] args) {
        LongConsumer add10 = num -> System.out.println(num + 10);
        add10.accept(50);
    }
}
