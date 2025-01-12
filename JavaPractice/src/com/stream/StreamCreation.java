package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {
    public static void main(String args[]){
        //ways to create stream

        //create a stream from collection
        List<Integer> number = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream= number.stream();

        //create a stream form Array
        int[] arr = {1,2,3,4,5};
        IntStream instStream = Arrays.stream(arr);

         Stream<Integer> streamOf = Stream.of(1,2,3,4,5);

         //check even numbers
         Predicate<Integer> evenNumber = a -> a%2==0;
        stream.filter(evenNumber).forEach(System.out::print);

        List<Integer> listOfInt = Arrays.asList(3,4,5,6,7);
        Stream<Integer> streamOfInt = listOfInt.stream();

        Function<Integer,Integer> square = numbersquare -> numbersquare * numbersquare;
        streamOfInt.map(square).forEach(System.out::println);




    }
}
