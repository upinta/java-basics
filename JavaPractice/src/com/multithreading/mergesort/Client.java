package com.multithreading.mergesort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String args[]) throws Exception {
        List<Integer> data = List.of(6,4,3,8,5,2,1,10);
        ExecutorService es = Executors.newCachedThreadPool();
        MergeSort mr = new MergeSort(data,es);
        //ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> sortedData =  es.submit(mr);
        //List<Integer> response = mr.call();
        System.out.println("sorted data is : "+sortedData.get());
        es.shutdown();
    }
}
