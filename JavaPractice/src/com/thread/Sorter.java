package com.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Sorter implements Callable<List<Integer>> {

    private List<Integer> list;
    private ExecutorService executorService;

    public Sorter(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    public List<Integer> call() throws ExecutionException, InterruptedException {
        if (list.size() <= 1) {
            return list;
        }
        int mid =list.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i=0;i<mid;i++){
            left.add(list.get(i));
        }
        for(int i=mid;i< list.size();i++){
            right.add(list.get(i));
        }

        Sorter leftSort = new Sorter(left,executorService);
        Sorter rightSort = new Sorter(right, executorService);
        //ExecutorService es = Executors.newCachedThreadPool();
        Future<List<Integer>> sorterLeftList = executorService.submit(leftSort);
        Future<List<Integer>> sorterRightList =  executorService.submit(rightSort);

        List<Integer> leftTobeSorted = sorterLeftList.get();
        List<Integer> rightTobeSorted = sorterRightList.get();
       // executorService.shutdown();
        return merge(leftTobeSorted,rightTobeSorted);
    }

    private List<Integer> merge(List<Integer> leftMergeSort, List<Integer> rightMergeSort) {
        List<Integer> responseArray = new ArrayList<>();
        int i=0, j=0;

        while (i < leftMergeSort.size() && j < rightMergeSort.size()) {
            if(leftMergeSort.get(i) < rightMergeSort.get(j)){
                responseArray.add(leftMergeSort.get(i));
                i++;
            } else {
                responseArray.add(rightMergeSort.get(j));
                j++;
            }
        }

        while(i< leftMergeSort.size()){
            responseArray.add(leftMergeSort.get(i));
            i++;
        }

        while (j < rightMergeSort.size()) {
            responseArray.add(rightMergeSort.get(j));
            j++;
        }
        return responseArray;
    }
}
