package Assignment_9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input= scanner.nextLine();
        //compile() is used to create Pattern from given Regular Expression
        Pattern pattern =Pattern.compile("[A-Z].+[.]");
        Matcher matcher=pattern.matcher(input);
        //matches method is used to tell whether the given string is matches with regular expression
        if(matcher.matches())
            System.out.println("Given input matches with the Pattern.");
        else 
            System.out.println("Given input does not matches with the Pattern.");
    }
}

