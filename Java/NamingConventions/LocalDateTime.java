import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws IOException {

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
