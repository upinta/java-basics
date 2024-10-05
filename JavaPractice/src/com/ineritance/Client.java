package com.ineritance;

final class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.display();	
		Child c = new Child();
		c.childDisplay();
		
		Person p1 = new Child();
		p1.display();
	}

}
