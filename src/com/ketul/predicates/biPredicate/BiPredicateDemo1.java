package com.ketul.predicates.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi_p = (a , b) -> a == b;
        System.out.println(bi_p.test(10, 10));
        System.out.println(bi_p.test(10, 20));
    }
}
