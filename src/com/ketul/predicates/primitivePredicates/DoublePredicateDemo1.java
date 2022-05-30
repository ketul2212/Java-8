package com.ketul.predicates.primitivePredicates;

import java.util.function.DoublePredicate;

public class DoublePredicateDemo1 {
    public static void main(String[] args) {
        double[] x = {10, 10.4, 15, 15.5, 20};
        DoublePredicate p = num -> num % 2 == 0;

        for(double num : x)
            if(p.test(num))
                System.out.println(num);
    }
}
