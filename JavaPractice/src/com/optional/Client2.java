package com.optional;

import java.util.Optional;

public class Client2 {
    public static void main(String args[]){
        Optional<String> optionalEmpty = Optional.empty();
        System.out.println(optionalEmpty);

        Optional<String> optionalOf = Optional.of("Hello world");
        System.out.println(optionalOf);

        Optional<String> optionalNullable = Optional.ofNullable("Hello");
        System.out.println(optionalNullable);

        if(optionalNullable.isPresent()){
            System.out.println(optionalNullable.get());
        }else {
            System.out.println("empty"+optionalNullable);
        }

        Optional<String> optionalNullable2 = Optional.ofNullable(null);

        String value = optionalNullable2.orElse("Default value");
        System.out.println(value);
        String supplierValue = optionalNullable2.orElseGet(() -> "supplier value");
        System.out.println(supplierValue);

        try {
            optionalNullable2.orElseThrow(() -> new IllegalArgumentException("Value not present"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }




    }
}
