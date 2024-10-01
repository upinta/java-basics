package com.deep.copy;


public class Person {
	String name;
	Address address;
	
	Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	Person(Person person){
		this.name = person.name;
		this.address = new Address(person.address);
	}
	
	void display() {
		System.out.println("name is : "+this.name+" city is "+this.address.city+" state is "+this.address.state);
	}
}
