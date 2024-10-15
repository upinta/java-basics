package com.multithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<List<Integer>> {
    public List<Integer> array;
    public ExecutorService es;
    public MergeSort(List<Integer> data, ExecutorService es ) {
        this.array = data;
        this.es = es;
    }
    @Override
    public List<Integer> call() throws Exception {
        //6,4,3,8,5,2,1,10)

       if(array.size()<=1){
           return array;
       }

       int mid = array.size()/2;
       List<Integer> leftArr = new ArrayList<>();
       List<Integer> rightArr = new ArrayList<>();

       for(int i=0;i<mid;i++) {
           leftArr.add(array.get(i));
       }
       for(int i=mid; i < array.size(); i++) {
           rightArr.add(array.get(i));
       }
        MergeSort leftMergeSorter = new MergeSort(leftArr,es);
        MergeSort rightMergeSorter = new MergeSort(rightArr,es);
       // ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> fs1 = es.submit(leftMergeSorter);
        Future<List<Integer>> fs2 = es.submit(rightMergeSorter);
        List<Integer> leftSortedArr = fs1.get();
        List<Integer> rightSortedArr = fs2.get();
        es.shutdown();

        //List<Integer> leftSortedArr = leftMergeSorter.call();
        //List<Integer> rightSortedArr = rightMergeSorter.call();

        return mergeArray(leftSortedArr, rightSortedArr);

    }

    private List<Integer> mergeArray(List<Integer> leftSortedArray, List<Integer> rightSortedArray) {
        List<Integer> response = new ArrayList<>();
        int i=0; int j=0;
        while(i < leftSortedArray.size() && j < rightSortedArray.size()) {
            if(leftSortedArray.get(i) <= rightSortedArray.get(j)){
                response.add(leftSortedArray.get(i));
                i++;
            } else {
                response.add(rightSortedArray.get(j));
                j++;
            }
        } while (i< leftSortedArray.size()){
            response.add(leftSortedArray.get(i));
            i++;
        }
        while(j < rightSortedArray.size()){
            response.add(rightSortedArray.get(j));
            j++;
        }
        return response;
    }
}
