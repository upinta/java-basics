package com.reference.variable;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog("Max ");
		Dog dog2 = dog1;
		
		dog1.bark();
		dog2.bark();
		
		dog2.name = "Buddy ";
		dog1.bark();
		dog2.bark();
	}

}
