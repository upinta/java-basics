package com.multithreading;

public class Client {

	public static void main(String[] args) {
		
		HelloWorldTask hwt = new HelloWorldTask();
		Thread t = new Thread(hwt);
		t.start();

	}

}
