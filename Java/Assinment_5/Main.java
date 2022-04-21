package com.company;

import com.company.data.First;
import com.company.singleton.Second;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Data data = new Data();
        data.print_global();
        data.print_local();

        Singleton singleton = new Singleton();
        singleton.func("hello");
        singleton.print();

    }


}
