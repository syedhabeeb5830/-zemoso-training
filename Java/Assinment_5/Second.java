package com.company.singleton;

public class Second {


    String str;

    public static Second func(String s){
        // non static method cannot be accessed in static methods
        str = s;

        Second sc = new Second();
        return sc;
    }

    public void print(){
        System.out.println(str);
    }
}

