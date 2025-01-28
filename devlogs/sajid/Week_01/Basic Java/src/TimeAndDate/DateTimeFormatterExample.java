package TimeAndDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime parse = LocalDateTime.parse("2021-08-15T12:00:00");
        System.out.println(parse);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String format = parse.format(dateTimeFormatter);
        System.out.println(format);
        String date="15/08/2021";
        LocalDate parse1 = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(parse1);
    }
}
