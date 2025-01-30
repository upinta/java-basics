package com.collection.prac;

public class StudentP {
    int age;
    public StudentP(int age){
        this.age = age;
    }

    public StudentP(StudentP ss){
        this.age = ss.age;
    }

    public int getAge() {
        return age;
    }
}
