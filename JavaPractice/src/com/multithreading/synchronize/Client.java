package com.multithreading.synchronize;



public class Client {
    public static void main(String args[]) throws InterruptedException {
        Counter c = new Counter(0);

        Adder a = new Adder(c);
        Substractor s = new Substractor(c);

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("value of count : "+c.getCount());
    }
}
