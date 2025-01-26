package com.collection.prac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(6,"bob"));
        students.add(new Student(8,"Alice"));
        students.add(new Student(5,"sss"));
        students.add(new Student(3,"jon"));

        /*Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Integer.compare(o1.id, o2.id);
            }
        };

        Comparator<Student> comparatorName = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.name.compareTo(o2.name);
            }
        };


        Collections.sort(students,comparatorName);
        Collections.sort(students,comparator);*/

        //java 8 sort by id
       // Comparator<Student> comparator = (s1, s2) -> Integer.compare(s1.id, s2.id);
      //  Collections.sort(students, comparator);
       // System.out.println(students);

        //java 8 sort by name
        //Comparator<Student> comparator2 = (s1, s2) -> s1.name.compareTo(s2.name);
        //Collections.sort(students, comparator2);
       // System.out.println(students);

        //Comparator.comparing()

    }
}
