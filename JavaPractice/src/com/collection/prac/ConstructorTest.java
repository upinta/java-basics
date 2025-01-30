package com.collection.prac;

public class ConstructorTest {
    public static void main(String args[]) {
        StudentP p = new StudentP(12);
        System.out.println(p.getAge());

        StudentP p2 = new StudentP(p);

        System.out.println(p2.getAge());
        p2.age = 56;
        System.out.println(p.getAge());
        System.out.println(p2.getAge());


    }
}
