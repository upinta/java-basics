package com.collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueMaxHeap {
    public static void main(String args[]) {
        PriorityQueue<Person> maxHeap = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age - o1.age;
            }
        });

        maxHeap.add(new Person("upinta",32));
        maxHeap.add(new Person("Avyaan", 4));
        maxHeap.add(new Person("Mukesh",34));

        System.out.println(maxHeap.poll());
     }
}
