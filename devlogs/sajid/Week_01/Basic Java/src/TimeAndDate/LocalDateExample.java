package TimeAndDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("Current Date: " + date);
        LocalDate myDate=LocalDate.of(1990,2,7);
        System.out.println("My Date: " + myDate);
        int day = date.getDayOfMonth();
        Month month=date.getMonth();
        int year=date.getYear();
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        LocalDate yesterday= date.minusDays(1);
        System.out.println("Yesterday: " + yesterday);
    }
}
