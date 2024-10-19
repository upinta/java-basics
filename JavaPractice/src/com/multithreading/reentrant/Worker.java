package com.multithreading.reentrant;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.locks.ReentrantLock;

public class Worker implements Runnable {
    String name;
    ReentrantLock reentrantLock;
    public Worker(ReentrantLock l1, String name){
        this.reentrantLock = l1;
        this.name = name;
    }

    @Override
    public void run() {
        boolean done  = false;
        while(!done){
            boolean ans = reentrantLock.tryLock();
            if(ans) {
                try {
                    Date d = new Date();
                    SimpleDateFormat sd = new SimpleDateFormat("hh:mm:ss");
                    System.out.println("task name - " + name + " outer lock acquired at " + sd.format(d)
                                    + " Doing outer work");
                    Thread.sleep(1500);

                    reentrantLock.lock();
                    try {
                        d = new Date();
                        sd = new SimpleDateFormat("hh:mm:ss");
                        System.out.println("task name - " + name + " inner lock acquired at " + sd.format(d)
                                + " Doing outer work");
                        System.out.println("Lock held count"+reentrantLock.getHoldCount());
                        Thread.sleep(1500);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        System.out.println("task name - " + name + " releasing inner lock");
                        reentrantLock.unlock();
                    }
                    System.out.println("Lock held count"+reentrantLock.getHoldCount());
                    System.out.println("task name - " + name + " work done");
                    done = true;
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println("task name - " + name + " releasing outer lock");
                    reentrantLock.unlock();
                    System.out.println("Lock Hold Count - " + reentrantLock.getHoldCount());
                }

            }
            else {
                System.out.println("task name - " + name
                        + " waiting for lock");
                /*try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }*/
            }
        }

    }
}
