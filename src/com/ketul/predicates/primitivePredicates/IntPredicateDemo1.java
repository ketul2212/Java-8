package com.ketul.predicates.primitivePredicates;

import java.util.function.IntPredicate;

public class IntPredicateDemo1 {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        IntPredicate p = num -> num % 2 == 0;

        for(int num : x)
            if(p.test(num))
                System.out.println(num);
    }
}
