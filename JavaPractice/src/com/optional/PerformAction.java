package com.optional;

import java.util.Optional;
import java.util.function.Consumer;

public class PerformAction {
    public static void main(String args[]){
        Optional<String> optionalValue = Optional.of("upinta");

        optionalValue.ifPresent(a -> System.out.println("Hello : "+a));

        Optional<String> optionalNull = Optional.ofNullable(null);

        optionalNull.ifPresentOrElse(a -> System.out.println("Hello : "+a),() -> System.out.println("value not present"));

        Optional<Person> personOptional = Optional.of(new Person("upinta", 30));
        Optional<Person> personEmpty = Optional.empty();

        Optional<Person> filterPerson = personOptional.filter(person -> person.getAge() > 25);
        Optional<Person> filterPersonEmpty = personEmpty.filter(person -> person.getAge() > 25);

        filterPerson.ifPresentOrElse( person -> System.out.println("Filtered Optional contains: " +person),
                () -> System.out.println("Filtered Optional is empty"));

        filterPersonEmpty.ifPresentOrElse( person -> System.out.println("Filtered Optional contains: " +person),
                () -> System.out.println("Filtered Optional is empty"));

        filterPerson.map(person -> person.getName().toUpperCase()).ifPresent(person -> System.out.println(person));

        //flatmap
        optionalValue.flatMap( a -> Optional.of(a.length()))
                .ifPresent(length -> System.out.println("Length of the string: " +length));
    }
}
