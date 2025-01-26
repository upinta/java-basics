package com.collection.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
    public static void main(String args[]) {

        List<Student> students = new ArrayList<>();
        students.add(new Student(6,"bob"));
        students.add(new Student(8,"Alice"));
        students.add(new Student(5,"sss"));
        students.add(new Student(3,"jon"));
        Collections.sort(students);
        System.out.println(students);
    }
}
