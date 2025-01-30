package com.thread.synchro;

import com.thread.Substractor;

public class AdderSubtractorWithoutSynchronization {
    private static int sharedValue = 1;

    static class Adder implements Runnable {

        Adder() {

        }

        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                sharedValue++;
            }
        }
    }

    static class Substractor implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<1000;i++){
                sharedValue--;
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        AdderSubtractorWithoutSynchronization ads = new AdderSubtractorWithoutSynchronization();
        Adder a = new Adder();
        Substractor s = new Substractor();
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(s);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Final value of sharedValue: " + sharedValue);
    }
}
