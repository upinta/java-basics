package com.exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Client {

    public static void main(String args[])  {
        try {
            fun();
        } catch (IOException e) {
           throw new RuntimeException();
        }
        System.out.println("inside main method");
    }

    static void fun() throws IOException {

            System.out.println("inside fun 1");
            FileReader reader = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(reader);
            String data =null;
            while ((data = br.readLine()) != null)
            {
                System.out.println(data);
            }

            br.close();
    }
}
