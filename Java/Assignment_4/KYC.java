package ASsignment_4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYC {
    public static void kycWindow(String signUpDate,String currentDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate signUp = LocalDate.parse(signUpDate, formatter);
        LocalDate current = LocalDate.parse(currentDate, formatter);
        if(signUp.isAfter(current)){
            System.out.println("No Range");
            return;
        }
        long yr = current.getYear() - signUp.getYear();
        LocalDate currentSignUp = signUp.plusYears(yr);
        LocalDate signUpStart = currentSignUp.minusDays(30);
        LocalDate signUpEnd = currentSignUp.plusDays(30);
        //back dating
        if(signUpEnd.isAfter(currentSignUp))
            signUpEnd = current;
        String startDate = signUpStart.format(formatter);
        String EndDate = signUpEnd.format(formatter);
        System.out.println(startDate+" "+EndDate);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int number_of_Inputs = scanner.nextInt();
        for(int i = 0;i < number_of_Inputs;i++){
          String  signUpDate = scanner.next();
          String currentDate = scanner.next();
            kycWindow(signUpDate, currentDate);
        }
    }

}

