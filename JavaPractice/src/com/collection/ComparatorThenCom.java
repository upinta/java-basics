package com.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorThenCom {
    public static void main(String args[]) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Upinta", 32));
        person.add(new Person("Mukesh", 34));
        person.add(new Person("Manju", 34));
        person.add(new Person("Avyaan", 4));
        person.add(new Person("Naveen", 29));

        /*person.sort(Comparator.comparing(Person::getAge).thenComparing(Person::getName));
        System.out.println(person);*/

        person.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int compare = Integer.compare(o1.getAge(), o2.getAge());

                if(compare !=0){
                    return compare;
                }
               // return 0;
                return o1.getName().compareTo(o2.getName());
            }
        });

        System.out.println(person);
    }
}
