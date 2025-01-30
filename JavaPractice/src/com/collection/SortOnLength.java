package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortOnLength {
    public static void main(String args[]) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Upinta", 32));
        person.add(new Person("Mukesh", 34));
        person.add(new Person("Manju", 34));
        person.add(new Person("Avyaan", 4));
        person.add(new Person("Naveen", 29));

        person.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int com =  Integer.compare(o1.getName().length(), o2.getName().length());

                if(com !=0){
                    return com;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(person);
    }
}
