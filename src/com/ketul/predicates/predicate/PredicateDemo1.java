package com.ketul.predicates.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 10;
        System.out.println(predicate.test(5));
        System.out.println(predicate.test(19));
    }
}
