package com.generics.upperbound;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]){
        /*Animal animal = new Animal("sdf");
        System.out.println(animal.getName());

        Animal animal2 = new Dog("flkl");
        System.out.println(animal2.getName());

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("first Animal"));
        printAnimalName(animalList);*/

        List<Dog> animalList1 = new ArrayList<>();
        animalList1.add(new Dog("first Animal"));
        printAnimalName(animalList1);

        List<Cat> cat = new ArrayList<>();
        cat.add(new Cat("meow"));
        //printAnimalName(cat);
       // printAnimalSuper(cat);

    }

    private static void printAnimalName(List<? extends Animal> animal) {
        for(Animal a: animal){
            System.out.println(a.getName());
        }
    }

    private static void printAnimalSuper(List<? super Dog> dog) {
        for(Object d: dog){
            System.out.println(d.getClass().getName());
        }
    }
}
