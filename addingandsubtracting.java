import java.time.LocalDate;
import java.time.LocalTime;

public class addingandsubtracting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today : " + today);
        System.out.println("Tomorrow : " + today.plusDays(4));
        System.out.println("Yesterday : " + today.minusDays(1));

        LocalTime current = LocalTime.now();
        System.out.println("Current time : " + current);
        System.out.println("Before 5 hours : " + current.minusHours(5));
        System.out.println("After 3 hours : " + current.plusHours(3));
    }
}