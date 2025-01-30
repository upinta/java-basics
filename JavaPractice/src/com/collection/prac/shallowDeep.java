package com.collection.prac;

public class shallowDeep {
    public static void main(String args[]) {
        Person p = new Person("upinta");

        Car c = new Car("svu2024", p);
        System.out.println(c.model +"==="+ c.owner);
        Car c1 = new Car(c);
        System.out.println(c1.model +"==="+ c1.owner);
        c.owner.name = "Mukesh";
        System.out.println(c1.model +"==="+ c1.owner);
        System.out.println(c.model +"==="+ c.owner);



    }
}
