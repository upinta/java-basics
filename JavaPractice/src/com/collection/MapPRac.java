package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapPRac {
    public static void main(String args[]) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Upinta");
        hashMap.put(2,"Avyaan");
        hashMap.put(3,"Mukesh");
        //hashMap.put(null, "dddd");

       // hashMap.forEach((key, value) -> System.out.println(key + "=>" + value));
        hashMap.compute(1, (key, value) -> value.concat("bhakar"));
        hashMap.computeIfAbsent(5, value -> "Suman");
     //   hashMap.forEach((key,value) -> System.out.println(key +"==="+ value));
        hashMap.merge(2, "Bhakar", String::concat);
        hashMap.forEach((key,value) -> System.out.println(key +"----"+ value));
        System.out.println("Alice's age: " + hashMap.getOrDefault(6,"balbir"));

        hashMap.values().stream().filter(val -> val.startsWith("A")).forEach(System.out::println);
        hashMap.keySet().stream().filter(key -> key>1).forEach(System.out::println);
        /*String value = hashMap.get(1);
        System.out.println(value);
        Collection<String> values = hashMap.values();
        for(String val : values) {
            System.out.println(val);
        }*/

        /*Set<Integer> set = hashMap.keySet();
        for(Integer setVal : set) {
            System.out.println(setVal);
        };

        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();

        for(Map.Entry<Integer, String> entt : entrySet) {
            entt.getKey() entt.getValue()
        }*/


    }
}
