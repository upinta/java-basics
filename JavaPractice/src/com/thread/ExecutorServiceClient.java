package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceClient {
    public static void main(String args[]) {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i=1;i<100;i++) {
            if(i==5||i==15||i==35){
                System.out.println("DEBUG");
            }
            NumberPrinter np = new NumberPrinter(i);
            service.submit(np);
        }
        service.shutdown();
    }
}
