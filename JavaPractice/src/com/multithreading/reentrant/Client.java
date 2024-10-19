package com.multithreading.reentrant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String args[]) {
        ReentrantLock lock = new ReentrantLock();

        ExecutorService es = Executors.newFixedThreadPool(2);
        Worker w1 = new Worker(lock, "job1");
        Worker w2 = new Worker(lock, "job2");
        Worker w3 = new Worker(lock, "job3");
        Worker w4 = new Worker(lock, "job4");

        es.submit(w1);
        es.submit(w2);
        es.submit(w3);
        es.submit(w4);

        es.shutdown();
    }
}
