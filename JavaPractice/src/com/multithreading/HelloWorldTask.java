package com.multithreading;

public class HelloWorldTask implements Runnable{

	@Override
	public void run() {
		System.out.println("hello workld : "+Thread.currentThread().getName());
		
	}
	

}
