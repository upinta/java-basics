package com.deep.copy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("Jaipur", "RJ");
		Person p =new Person("Muke", a);
		p.display();
		
		Person p1 = new Person(p);
		p1.display();
		
		p1.name = "Avni";
		p.display();
		p1.display();
		
		p1.address.city = "Bikaner";
		p.display();
		p1.display();
	}

}
