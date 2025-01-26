package com.collection.prac;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
