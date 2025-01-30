package com.collection.prac;

public class Car {
    String model;
    Person owner;

    public Car(String model, Person owner) {
        this.model = model;
        this.owner = owner;
    }



    public Car(Car c){
        this.model = c.model;
        this.owner = new Person(c.owner.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", owner=" + owner +
                '}';
    }

}
