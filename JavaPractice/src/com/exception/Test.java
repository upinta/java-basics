package com.exception;

public class Test {
    Integer first;
    Integer second;
    public Test(Integer first, Integer second) throws NullPointerException{
        if(first==null){
            throw new NullPointerException("first is null=====");
        }
        this.first = first;
        this.second = second;
    }

    public Integer getFirst() {
        return first+2;
    }

    public Integer getSecond() {
        return second;
    }
}
