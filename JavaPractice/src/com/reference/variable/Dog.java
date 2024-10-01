package com.reference.variable;

public class Dog {
	String name;
	
	public Dog(String name) {
		this.name = name;
	}
	
	void bark() {
		System.out.println(this.name+"says woof!!");
	}

}
