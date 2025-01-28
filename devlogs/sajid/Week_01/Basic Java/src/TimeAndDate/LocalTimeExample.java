package TimeAndDate;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now= LocalTime.now();
        System.out.println("Current Time: " + now);
        LocalTime customTime=LocalTime.of(12,30,45);
        System.out.println("Custom Time: " + customTime);
        String timeInString="10:15:30";
        LocalTime parsedTime=LocalTime.parse(timeInString);
        System.out.println("Parsed Time: " + parsedTime);
    }
}
