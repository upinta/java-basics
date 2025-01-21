package com.thread;

import java.util.TreeMap;

public class Client {
    public static void main(String args[]) {
        /*HelloWorldPrinter hp = new HelloWorldPrinter();
        Thread t = new Thread(hp);
        t.start();*/

        for(int i=0;i<100;i++) {
            NumberPrinter np = new NumberPrinter(i);
            Thread tt = new Thread(np);
            tt.start();
        }
    }
}
