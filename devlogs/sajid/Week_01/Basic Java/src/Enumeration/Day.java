package Enumeration;

public enum Day {
    SATARDAY,SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY;

    public void display()
    {
        System.out.println( "Today is "+ this.name());
    }
}
