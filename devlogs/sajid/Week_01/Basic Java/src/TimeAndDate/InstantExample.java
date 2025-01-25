package TimeAndDate;

import java.time.Instant;
import java.time.LocalDate;

public class InstantExample {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        //go to epoch converter to convert the time to human readable format
        System.out.println("Current Time in Millis: " + currentTimeMillis);
        Instant now = Instant.now();
        System.out.println("Current Time in Instant: " + now);

    }
}
