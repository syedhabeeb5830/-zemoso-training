package com.company;
import java.io.File;
import java.util.Scanner;

public class Main {

    private static void findFile()
    {


        // Specifying path where to search for the file or a folder
        File file = new File("/home/syedU/Desktop");
        Scanner in = new Scanner(System.in);
        // do while is used to as files repeatedly

        while(true){
            System.out.println("1. For searching for the file");
            System.out.println("2. For stop searching");
            int num = in.nextInt();
            if(num == 2)break;
            else {
                boolean isFound = false;
                System.out.println("enter the name of the file or folder");
                String reqFile = in.next();
                String[] files = file.list();
                for (String tempFile : files) {
                    //check the name of file present or not and store in boolean str1
                    if (reqFile.equals(tempFile)) {
                        isFound = true;
                        System.out.println("File Found : ");
                        System.out.println(tempFile);
                        //print the address of the file
                        System.out.println("Path : " + file.getAbsolutePath());
                    }
                }
                //if file not found
                if (!isFound) {
                    System.out.println("File not find !");
                }
            }

        }




    }



    public static void main(String[] args) {
        // write your code here

//
        findFile();








    }
}

