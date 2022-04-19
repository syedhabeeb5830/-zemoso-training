package com.company;

import com.company.data.First;
import com.company.singleton.Second;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        First first = new First();
        first.print_global();
        first.print_local();


        Second second = new Second();
        second.func("hello");
        second.print();





    }


}
