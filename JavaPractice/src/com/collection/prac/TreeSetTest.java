package com.collection.prac;

import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String args[]) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(455);

        System.out.println(treeSet);
    }
}
