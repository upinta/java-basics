package com.shallow.copy;

public class Person {
	String name;
	Address address;
	
	Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	Person(Person other){
		this.name = other.name;
		this.address = other.address;
	}
	
	void display() {
		System.out.println("name is : "+this.name+" city is "+this.address.city+" state is "+this.address.state);
	}
}
