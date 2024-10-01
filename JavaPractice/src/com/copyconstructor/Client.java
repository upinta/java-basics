package com.copyconstructor;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(10, "sdf");
		p.display();
		Person p2 = p;
		p2.display();
		
		p2.age  = 50;
		p.display();
		
	}

}
