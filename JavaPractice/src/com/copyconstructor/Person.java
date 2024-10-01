package com.copyconstructor;

public class Person {
	int age;
	String name;
	
	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	void display() {
		System.out.println(name +" age :: "+ age);
	}

}
