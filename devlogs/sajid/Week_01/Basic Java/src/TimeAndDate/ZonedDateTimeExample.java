package TimeAndDate;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {
    public static void main(String[] args) {
        // Create a ZonedTime object
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Time: " + zonedDateTime);
      //  ZoneId.getAvailableZoneIds().forEach(System.out::println);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(2021, 12, 25, 12, 0, 0, 0, ZoneId.of("Asia/Kolkata"));
        System.out.println("Zoned Time: " + zonedDateTime1);
        ZonedDateTime parse = ZonedDateTime.parse("2021-12-25T12:00:00+05:30[Asia/Kolkata]");
        System.out.println("Zoned Time: " + parse);
    }
}
