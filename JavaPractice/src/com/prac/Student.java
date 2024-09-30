package com.prac;

public class Student {
	int age;
	String name;
	
	Student(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println("My name is "+this.name+". I am "+this.age+" years old");
	}
	
	public void sayHello(String str) {
		System.out.println(this.name+ " says hello to "+str);
	}

}
