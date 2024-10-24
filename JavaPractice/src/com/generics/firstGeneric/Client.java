package com.generics.firstGeneric;

import java.util.List;

public class Client {
    public static void main(String args[]) {
        GenericFirst<Double, Double> coordiante = new GenericFirst<>(3.67,2.55);
        GenericFirst<Integer,Integer> gf1 = new GenericFirst<>(34,56);

        List<GenericFirst<Integer,Integer>> list = List.of(gf1);

    }
}
