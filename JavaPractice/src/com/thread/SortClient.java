package com.thread;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SortClient {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        List<Integer> listOfInt = List.of(6,4,2,7,9,3,10,1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Sorter s = new Sorter(listOfInt,executorService);

        Future<List<Integer>> sorterList = executorService.submit(s);
        List<Integer> sortedList = sorterList.get();
        executorService.shutdown();
        System.out.println(sortedList);
    }
}
