package com.multithreading.number;

public class NumberPrinter implements Runnable{
	int i;
	public NumberPrinter(int num) {
		this.i = num;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" : num is "+i);
		
	}

}
