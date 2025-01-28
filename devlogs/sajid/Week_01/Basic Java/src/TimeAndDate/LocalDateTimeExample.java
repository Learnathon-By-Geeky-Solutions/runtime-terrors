package TimeAndDate;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + dateTime);
       LocalDateTime customTime= LocalDateTime.of(1990, 2, 7, 12, 30, 45);
        System.out.println("Custom Date and Time: " + customTime);
        String dateTimeInString = "1990-02-07T12:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeInString);
        System.out.println("Parsed Date and Time: " + parsedDateTime);
    }
}
