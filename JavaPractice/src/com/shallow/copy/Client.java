package com.shallow.copy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address = new Address("Gurgaon", "HR");
		Person p = new Person("upinta", address);
		p.display();
		
		Person p2 = new Person(p);
		p2.display();
		
		p2.name = "Mukes";
		p2.display();
		p.display();
		
		p2.address.city = "NCR";
		p2.display();
		p.display();

	}

}
