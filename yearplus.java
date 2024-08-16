import java.time.LocalDate;

public class yearplus {
    public static void main(String[] args) {
        LocalDate d= LocalDate.now();
        System.out.println("today : " + d);
        LocalDate yesterday = d.minusDays(1);
        System.out.println("yesterday: " + yesterday);
        LocalDate tom = d.plusDays(1);
        System.out.println("tomorrow: " + tom);
        LocalDate march = LocalDate.of(2025,3,31);
        System.out.println("March : " +  march);
        LocalDate dec = LocalDate.of(2025,12,31);
        System.out.println("dec : " + dec);
        System.out.println("leap year : + "+ dec.isLeapYear());
        System.out.println(d.isLeapYear());
    }
}