package com.ketul.predicates.primitivePredicates;

import java.util.function.LongPredicate;

public class LongPredicateDemo1 {
    public static void main(String[] args) {
        long[] x = {0, 5, 10 , 15, 20};
        LongPredicate p = num -> num % 2 == 0;

        for(long num : x)
            if(p.test(num))
                System.out.println(num);
    }
}
