package com.company.data;

public class First {

    public int a;
    char b ;
    public void print_global(){
        System.out.println(a);
        System.out.println(b);

    }
    public void print_local(){
//        without the initialization of local variable print their value in not possible.
        int x;
        int y;
        System.out.println(x);
        System.out.println(y);
    }


}

