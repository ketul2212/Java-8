package com.ketul.consumers.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {
    public static void main(String[] args) {
        BiConsumer<Integer, Integer> bi_c = (num1, num2) -> System.out.println(num1 + num2);
        bi_c.accept(10, 20);
    }
}
