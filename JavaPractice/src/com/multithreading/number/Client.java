package com.multithreading.number;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

	public static void main(String[] args) {
		//ExecutorService ex = Executors.newFixedThreadPool(10);
		ExecutorService ex = Executors.newCachedThreadPool();
		for(int i=0;i<100;i++) {
			if( i==5 || i==99) {
				System.out.println("DEBUG");
			}
			NumberPrinter nm = new NumberPrinter(i);
			ex.submit(nm);
			
		}
		ex.shutdown();

	}

}
