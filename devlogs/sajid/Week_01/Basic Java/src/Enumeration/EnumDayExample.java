package Enumeration;

public class EnumDayExample {
    public static void main(String[] args) {
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
//        System.out.println("Monday");
        /*we will do instead of the above ones */
        //By creating class and the public static final field
        System.out.println("Using Class\n");
        System.out.println(DayClass.SATURDAY);
        System.out.println(DayClass.SUNDAY);
        System.out.println(DayClass.MONDAY);
        //By Creating Interface

        System.out.println("\n\n\nUsing Interface\n"+DayInterface.TUESDAY);

        //By Creating Enum
        System.out.println("\n\nUsing Enum \n"+Day.FRIDAY);
        System.out.println(Day.SUNDAY);
        Day friday = Day.FRIDAY;
        int ordinal = friday.ordinal();
        System.out.println(ordinal);
        friday.display();

    }
}
