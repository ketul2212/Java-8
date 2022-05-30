package com.ketul.streams.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo1 {
    /*
    * 1. Difference between filter() and takeWhile()
    * Ans:- I) filter():-
    *               Takes all the values that match the Predicate.
    *       II) takeWhile():-
    *               Takes values while the Predicate returns true, If Predicate returns false then takeWhile() will stop.
    *
    * 2. Use of peek()
    * Ans:- peek() is used for debugging.
    *
    *   */
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(0, 10, 20, 5, 15, 25, 5);
        System.out.println(list1);

        List<Integer> list2 = list1.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("After apply filter() ---> " + list2);

        List<Integer> list3 = list1.stream().map(num -> num + 10).collect(Collectors.toList());
        System.out.println("After apply map() ---> " + list3);

        List<Integer> list4 = list1.stream().filter(num -> num % 2 == 0).map(num -> num + 10).collect(Collectors.toList());
        System.out.println("After Apply 1st filter() than map() ---> " + list4);

        List<Integer> list5 = list1.stream().map(num -> num + 2).filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println("After apply 1st map() than filter() ---> " + list5);

        long count = list1.stream().filter(num -> num % 2 == 0).count();
        System.out.println("count() method ---> " + count);

        List<Integer> list6 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("After default natural sorting order ---> " + list6);

        List<Integer> list7 = list1.stream().sorted((num1, num2) -> -num1.compareTo(num2)).collect(Collectors.toList());
        System.out.println("After Customized Sorting ---> " +list7);

        List<Integer> list8 = list1.stream().skip(2).collect(Collectors.toList());
        System.out.println("After removing some elements ---> " + list8);

        boolean allMatch = list1.stream().allMatch(num -> num > 20);
        System.out.println("All elements satisfy with Predicate or not ( >20 ) ---> " + allMatch);

        boolean anyMatch = list1.stream().anyMatch(num -> num > 20);
        System.out.println("Any one element satisfy with Predicate or not ( >20 ) ---> " + anyMatch);

        boolean match = list1.stream().noneMatch(num -> num == 100);
        System.out.println("Any one element satisfy with Predicate ( == 100) or not with noneMatch() [It's opposite for anyMatch()] ---> " + match);

        List<Integer> list9 = list1.stream().distinct().collect(Collectors.toList());
        System.out.println("All distinct elements are ---> " + list9);

        List<Integer> list10 = list1.stream().dropWhile(num -> num < 20).collect(Collectors.toList());
        System.out.println("Break after predicate ( <20 ) false ---> " + list10);

        List<Integer> list11 = list1.stream().limit(3).collect(Collectors.toList());
        System.out.println("After set limit ---> " + list11);

        List<Integer> list12 = list1.stream().mapToInt(num -> num + 25).boxed().collect(Collectors.toList());
        System.out.println("After applied mapToInt() ---> " + list12);

        List<Long> list13 = list1.stream().mapToLong(num -> num * 2).boxed().collect(Collectors.toList());
        System.out.println("After applied mapToLong() ---> " + list13);

        List<Double> list14 = list1.stream().mapToDouble(num -> num * 2.5).boxed().collect(Collectors.toList());
        System.out.println("After applied mapToDouble() ---> " + list14);

        int minValue1 = list1.stream().min(Comparator.naturalOrder()).get();
        int minValue2 = list1.stream().min(Integer::compareTo).get();
        int minValue3 = list1.stream().min((num1, num2) -> num1.compareTo(num2)).get();
        System.out.println("Min Value present in the stream is (3 ways and it's O/P) ---> [" + minValue1 + ", " + minValue2 + ", " + minValue3 + "]");

        int maxValue1 = list1.stream().max(Comparator.naturalOrder()).get();
        int maxValue2 = list1.stream().max(Integer::compareTo).get();
        int maxValue3 = list1.stream().max((num1, num2) -> num1.compareTo(num2)).get();
        System.out.println("Max Value present in the stream is (3 ways and it's O/P) ---> [" + maxValue1 + ", " + maxValue2 + ", " + maxValue3 + "]");

        List<String> list15 = Stream.of("Ketul", "Sunny", null, "Bunny", "Chinny").takeWhile(Objects::nonNull).collect(Collectors.toList());
        System.out.println("After apply takeWhile() ---> " + list15);

        List<Integer> list16 = list1.stream().peek(System.out::println).filter(num-> num % 2 == 0).collect(Collectors.toList());
        System.out.println("After Apply peek() [peek() is used for debugging] and then apply filter() ---> " + list16);
    }
}
