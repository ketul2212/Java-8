package com.ketul.predicates.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25};

        Predicate<Integer> p1 = num -> num > 10;
        Predicate<Integer> p2 = num -> num % 2 == 0;

        m1(p1.and(p2), x);
        m1(p1.or(p2), x);
        m1(p1.negate(), x);
    }

    public static void m1(Predicate<Integer> p, int[] x) {

        for(int num : x)
            if(p.test(num))
                System.out.print(num + " ");

        System.out.println("\n------------------------------------------");
    }
}
