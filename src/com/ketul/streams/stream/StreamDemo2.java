package com.ketul.streams.stream;

import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 10, 20, 5, 15, 25);

        System.out.print("After Apply toArray() version:1 [It's return Object[]] ---> ");
        Object[] array1 = list1.stream().filter(num -> num % 2 == 0).toArray();
        for(Object object : array1)
            System.out.print(object + " ");
        System.out.println();

        System.out.print("After Apply toArray() version:2 ---> ");
        Integer[] array2 = list1.stream().toArray(Integer[]::new);
        for(Integer num : array2)
            System.out.print(num + " ");
        System.out.println();
    }
}
