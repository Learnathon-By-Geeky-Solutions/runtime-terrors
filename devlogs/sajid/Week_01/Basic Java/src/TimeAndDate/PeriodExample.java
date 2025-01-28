package TimeAndDate;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate birthday = LocalDate.of(1995, 8, 15);
        Period between = Period.between(birthday, now);
        System.out.printf("You are %d years, %d months and %d days old", between.getYears(), between.getMonths(), between.getDays());
    }
}
