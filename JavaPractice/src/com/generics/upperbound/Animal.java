package com.generics.upperbound;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.*;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
