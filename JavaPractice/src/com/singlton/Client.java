package com.singlton;

public class Client {
    public static void main(String ags[]) {
        DBConnection db1 = DBConnection.getInstance();
        DBConnection db2 = DBConnection.getInstance();

        if(db1 == db2) {
            System.out.println("DB connections are equals");
        } else {
            System.out.println("DB connections are not equals");
        }

        System.out.println(db1 + " "+ db2);

    }
}
