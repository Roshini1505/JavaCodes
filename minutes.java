import java.time.LocalTime;

public class minutes {
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        System.out.println("current time: " + t);
        LocalTime minushours = t.minusHours(3);
        System.out.println("2 hours before : " + minushours);
        LocalTime minusminutes = t.minusMinutes(30);
        System.out.println("30 mins before : " + minusminutes);
        LocalTime eve = LocalTime.of(5,30,20);
        System.out.println("evening : " + eve);
    }
}