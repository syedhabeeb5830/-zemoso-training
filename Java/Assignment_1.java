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
        do{
            boolean isFound = false;
            System.out.println("Enter the name of the File or Folder");
            //take input
            //string to store the name of the file
           String reqFile =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            // check each file or folder
            if(files == null) break;
            for (String tempFile : files){
                //check the name of file present or not and store in boolean str1
                if (reqFile.equals(tempFile)){
                    isFound = true;
                    System.out.println("File Found : ");
                    System.out.println(tempFile);
                    //print the address of the file
                    System.out.println("Path : "+ file.getAbsolutePath());
                }
            }
            //if file not found
            if(!isFound)
            {
                System.out.println("File not find !");
            }
        } while(true);
    }



    public static void main(String[] args) {
        // write your code here


        findFile();








    }
}

