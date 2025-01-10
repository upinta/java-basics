package com.optional;

import java.util.Optional;

public class Client {
    public static void main(String args[]){
        Optional<String> optional = Optional.of("Upinta");

        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        Optional<String>  emptyValue = Optional.empty();
        System.out.println(emptyValue.orElse("fkgjfgk"));


        Optional<String> newoptional = Optional.of("upintasingh");
        Optional<String> newOptionalUpperCase =  newoptional.map(String::toUpperCase);
        System.out.println(newOptionalUpperCase.get());

        newoptional.ifPresent(n -> System.out.println("Hello "+n));




    }
}
