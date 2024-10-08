package com.staticoverride;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println(b.sd);
		A a = new B();
		
		
		/*
		 * if there is a static method then it will make call to A class method. it does not support overriding
		 * here
		 * */
	}

}
