# Java LocalDateTime class
Java LocalDateTime class is an immutable date-time object that represents a date-time, with the default format as yyyy-MM-dd-HH-mm-ss.zzz. It inherits object class and implements the ChronoLocalDateTime interface.


# Nameing Conventions: Java uses CamelCase as a practice for writing names of methods, variables, classes, packages, and constants. 

Camel’s case in java programming consists of compound words or phrases such that each word or abbreviation begins with a capital letter or first word with a lowercase letter, rest all with capital.


---
<br></br>
## Methods in LocalDateTime and Naming Conventions
| Method Name | Description and Naming Convention |
|---|---|
| String format(DateTimeFormatter formatter)	| It is used to format this date-time using the specified formatter.
|int get(TemporalField field)|	It is used to get the value of the specified field from this date-time as an int.|
|LocalDateTime minusDays(long days)|	It is used to return a copy of this LocalDateTime with the specified number of days subtracted.|
|static LocalDateTime now()	|It is used to obtain the current date-time from the system clock in the default time-zone.|
|static LocalDateTime of(LocalDate date, LocalTime time)	|It is used to obtain an instance of LocalDateTime from a date and time.|
|LocalDateTime plusDays(long days)	|It is used to return a copy of this LocalDateTime with the specified number of days added.|
|boolean equals(Object obj)	|It is used to check if this date-time is equal to another date-time.|





# Code for LocalDateTime 



package com.company;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {




    public static void main(String[] args) {
        // write your code here



        // now() method is used to give the current local date and time
        System.out.println(LocalDateTime.now());


        //It is used to obtain an instance of LocalDateTime from a date and time.
        LocalDate localDate = LocalDate.of(2022, Month.APRIL, 15);
        System.out.println(localDate);

        //plusDays() adds the specified days, weeks or years
        localDate = localDate.plusDays(2);
        System.out.println(localDate);

        // minusDays() subtracts the specified days, weeks or years
        localDate = localDate.minusDays(5);
        System.out.println(localDate);


        LocalDate localDate2 = LocalDate.of(2021, Month.FEBRUARY, 23);
        //checks whether the date or times are equal
        System.out.println(localDate2.equals(localDate));



        LocalTime localTime = LocalTime.of(14, 38);
        System.out.println(localTime);



        //It is used to obtain an instance of LocalDateTime from a date and time.
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);



        //formats the date and time according to the date and time provided
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yy hh mm ");
        System.out.println(localDateTime.format(dateTimeFormatter));







    }
}
