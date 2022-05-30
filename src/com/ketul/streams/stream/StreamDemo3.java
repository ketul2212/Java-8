package com.ketul.streams.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class StreamDemo3 {
    public static void main(String[] args) {

        /*
        * 1. Difference between range() and rangeClosed()
        * Ans:- I) range():-
        *               range(1,10) method generates numbers from 1 to 9.
        *       II) rangeClosed():-
        *               rangeClosed(1,10) method generates numbers from 1 to 10.
        * */

        System.out.println("====================");
        System.out.println("reduce() demo 1");
        System.out.println("====================");
        String[] stringArray1 = {"Patel", "Ketul", "Pareshbhai"};
        Optional<String> optionalResult1 = Arrays.stream(stringArray1).reduce((string1, string2) ->
                string1.length() > string2.length() ? string1 : string2);
        optionalResult1.ifPresent(System.out::println);
        System.out.println(optionalResult1.get());
        System.out.println();

        System.out.println("====================");
        System.out.println("reduce() demo 2");
        System.out.println("====================");
        String stringResult1 = Arrays.stream(stringArray1).reduce("Another",(string1, string2) ->
                string1 + "-" + string2);
        System.out.println(stringResult1);
        System.out.println();

        System.out.println("====================");
        System.out.println("reduce() demo 3");
        System.out.println("====================");
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        int optionalResult2 = list1.stream().reduce((num1, num2) -> num1 + num2).orElse(-1);
        System.out.println(optionalResult2);
        System.out.println();

        System.out.println("====================");
        System.out.println("reduce() demo 4");
        System.out.println("====================");
        int sum = list1.stream().reduce(5, Integer::sum);
        System.out.println(sum);
        System.out.println();

        System.out.println("====================");
        System.out.println("reduce() demo 5");
        System.out.println("====================");
        int mul = IntStream.range(1, 10).reduce((num1, num2) -> num1 * num2).orElse(0xffffffff);
        System.out.println(mul);
        System.out.println();


        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();


        System.out.println("=======================");
        System.out.println("Primitive stream demo 1");
        System.out.println("=======================");
        long mul1 = LongStream.rangeClosed(1, 10).reduce((num1, num2) -> num1 * num2).orElse(0xffffffff);
        System.out.println(mul1);
        System.out.println();

        System.out.println("=======================");
        System.out.println("Primitive stream demo 2");
        System.out.println("=======================");
        double mul2 = DoubleStream.of(3, 10.7, 12.5, 4.2).reduce((num1, num2) -> num1 * num2).orElse(0xffffffff);
        System.out.println(mul2);
        System.out.println();

        System.out.println("=======================");
        System.out.println("Primitive stream demo 3");
        System.out.println("=======================");
        int add = IntStream.concat(IntStream.rangeClosed(1, 10), IntStream.rangeClosed(11, 20)).reduce(1, Integer::sum);
        System.out.println(add);
        System.out.println();
    }
}