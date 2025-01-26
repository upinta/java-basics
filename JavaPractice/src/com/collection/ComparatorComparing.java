package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparing {
    public static void main(String args[]) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Upinta", 32));
        person.add(new Person("Mukesh", 34));
        person.add(new Person("Avyaan", 4));
        person.add(new Person("Naveen", 29));


        person.sort(Comparator.comparing(p1 -> p1.age));
        System.out.println(person);

        person.sort(Comparator.comparing(p2 -> p2.name));
        System.out.println(person);
    }
}
