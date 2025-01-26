package com.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDqueue {
    public static void main(String args[]){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(2);
        deque.addFirst(3);
        deque.addLast(7);

        System.out.println(deque.removeLast());
    }
}
