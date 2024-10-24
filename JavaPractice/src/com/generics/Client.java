package com.generics;

import java.util.List;

public class Client {
    public static void main(String args[]){
        Pair p = new Pair(34.4, 9);
       String s = (String) p.getX();
        System.out.println(s.getBytes().length);


    }
}
