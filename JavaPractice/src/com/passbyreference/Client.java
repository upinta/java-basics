package com.passbyreference;

public class Client {
	public static void changeName(Person p) {
		p.name = "upinta";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Avyaan");
		
		System.out.println(p.name);
		changeName(p);
		System.out.println(p.name);
	}

}
