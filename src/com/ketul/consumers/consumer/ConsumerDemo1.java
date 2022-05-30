package com.ketul.consumers.consumer;

import java.util.function.Consumer;

public class ConsumerDemo1 {

    public static void main(String[] args) {
        Consumer<String> printName = s -> System.out.println(s);
        printName.accept("Ketul Patel");
    }
}
