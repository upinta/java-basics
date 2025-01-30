package com.collection.prac;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class CodingPrb {
    public static void main(String args[]) {
        //. Print a list using Lambda Expressions
        List<String> str = Arrays.asList("upinta","mukesh","avyaan");
        str.stream().forEach(System.out::println);

        //Filter even numbers from a list using Streams.
        List<Integer> listOfNum = Arrays.asList(1,2,3,4,5,6,7,8,9);
        listOfNum.stream().filter(num -> num %2==0).toList().forEach(System.out::println);

        //. Find the maximum value in a list using Streams.
        List<Integer> listOfNumbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Optional<Integer> max = listOfNumbers.stream().max(Integer::compareTo);
        System.out.println("max value is : "+max.get());

        //Convert a list of strings to uppercase
        List<String> listOfStr = Arrays.asList("upinta","mukesh","avyaan");
        listOfStr.stream().map(String::toUpperCase).toList().forEach(System.out::println);

        //group by length of a string
        List<String> listOfStr2 = Arrays.asList("upinta","mukesh","aval","ass");
         Map<Integer, List<String>> grouped = listOfStr2.stream().collect(Collectors.groupingBy(String::length));
         System.out.println(grouped);

         //partition by even odd numbers
        List<Integer> numList = Arrays.asList(3,6,4,5,90,78,67,53,31);
        Map<Boolean, List<Integer>> partitionBy = numList.stream().collect(Collectors.partitioningBy(n -> n%2 == 0));
        System.out.println(partitionBy);

        //sum of integer using reduce
        List<Integer> numListForSum = Arrays.asList(3,6,4,5,90,78,67,53,31);
        Integer sum = numListForSum.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        //Concatenate strings using joining()
        List<String> listConcat = Arrays.asList("java", "is", "awasome");
        String joined = listConcat.stream().collect(Collectors.joining());
        System.out.println(joined);

        // Count word occurrences in a list using groupingBy().
        List<String> wordCountStr = Arrays.asList("java", "is", "java");
        Map<String, Long> len = wordCountStr.stream().collect(Collectors.groupingBy(w -> w,Collectors.counting()));
        System.out.println(len);

        //distinct number in a list
        List<Integer> num = Arrays.asList(2,4,5,6,6,7,7,8,8);
        List<Integer> uniqueNum = num.stream().distinct().toList();
        System.out.println(uniqueNum);







    }
}
