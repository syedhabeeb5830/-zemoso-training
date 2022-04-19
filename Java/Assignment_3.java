package com.company;

import com.company.code.TheCode;

import java.io.IOException;
import java.net.InetAddress;

public class Main {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        String ipAddress="127.1.0.100";
        //the above ip address is  a ipv4 address also known as local host
        InetAddress giveAddress=InetAddress.getByName(ipAddress);
        System.out.println("sending ping request to:"+ipAddress);
        if(giveAddress.isReachable(3000))
            System.out.println("host is reachable");
        else
            System.out.println("host is not reachable");

        long end=System.currentTimeMillis();
        long time=(end-start)/2;
        System.out.println("the median time :"+time+"ms");
    }


}
