package com.method.overload;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected void display(String name) {
		System.out.println(name + " : "+this.age);
	}
	
	public void display(String name, int age) {
		System.out.println(name + " age is : "+age);
	}

}
