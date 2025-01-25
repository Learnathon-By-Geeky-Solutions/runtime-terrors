package TimeAndDate;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationExample {
    public static void main(String[] args) {
        Instant start = Instant.now();
        for(int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        Instant end = Instant.now();
        System.out.println("Duration between start and end: " + Duration.between(start, end));
        Duration duration = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println("Duration of 1 millisecond: " + duration);

    }
}
