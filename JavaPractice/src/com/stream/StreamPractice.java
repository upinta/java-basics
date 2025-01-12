package com.stream;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String args[]) {
        List<Integer> number = List.of(1,2,3,4,5,6,7,8,9);

        Function<Integer,Integer> square = a -> a*a;
        //print the square of each number.
        number.stream().map(square).forEach(System.out::println);

        // print every even number.
        Predicate<Integer> evenNum = a -> a%2 == 0;
        List<Integer> evenNumberTest = List.of(1,2,3,4,5,6,7,8,9,10);
        evenNumberTest.stream().filter(evenNum).forEach(System.out::println);

        // For a list of integers, return a list of the squares of each number.
        List<Integer> evenNumberList = List.of(1,2,3,4,5,6,7,8,9,10);
        Function<Integer,Integer> squareNumber = a -> a*a;
        List<Integer> num = evenNumberList.stream().map(squareNumber).toList();
        System.out.println(num);

        //For a list of strings, return a list of the length of each string
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        // Enter your code here
        List<Integer> lengthList= names.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengthList);


        //For a list of strings, filter out the strings which do not start with the letter `T` and then uppercase the remaining strings.
        List<String> namesString = List.of("Tantia Tope","Rani Lakshmibai","Mangal Pandey","Nana Sahib");
        namesString.stream().filter(a-> !a.startsWith("T")).map(String::toUpperCase).forEach(System.out::println);

        //For a list of strings, filter out the strings which do not start with the letter `T`, then uppercase the remaining strings and then sort them.
        List<String> namesSort = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        namesSort.stream().filter(a-> !a.startsWith("T")).map(String::toUpperCase).sorted().forEach(System.out::println);

        //For a list of integers, find the sum of all the numbers.
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> sum = numbers.stream().reduce((a, b) -> a+b);
        System.out.println(sum.get());

        //numbers.stream().mapToInt(Integer::intValue).sum();
        //For a list of integers, find the sum of the squares of all the numbers.
        List<Integer> numbersSumSquare = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfSquare = numbersSumSquare.stream().mapToInt(n -> n*n).sum();
        System.out.println(sumOfSquare);

        // For a list of integers, find the sum of the squares of all the even numbers.
        List<Integer> numList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sumOfEvenNumSquare  = numList.stream().filter(n -> n%2 == 0).mapToInt(n -> n*n).sum();
        System.out.println(sumOfEvenNumSquare);

        List<Integer> maxNum = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> maxNumber = maxNum.stream().max(Integer::compareTo);
        //maxNumber.ifPresent();

        //Given a list of numbers with duplicates, find the distinct numbers in the list
        List<Integer> listOfDuplicates = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        List<Integer> numListDistinct = listOfDuplicates.stream().distinct().toList();
        System.out.println(numListDistinct);

        listOfDuplicates.stream().all






    }
}
