package com.exception;

public class Client2 {
    public static void main(String args[])  {
        /*try {
            fun(0);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }*/
        try {
            String s = "";

        } catch (NewException e){
            System.out.println(e.getMessage());
        }

        System.out.println("eeeeeeeeee");
    }
    static void fun(int a) {
        if(a==0){
            throw new NewException("can not / by 0");
        }
        int aa = 10/a;
        System.out.println(aa);

    }
}
