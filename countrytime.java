import java.time.LocalTime;
import java.time.ZoneId;
import java.time.Instant;

public class countrytime {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        System.out.println("current time : " + lt);

        Instant i = Instant.now();
        System.out.println(i);

        for(String val : ZoneId.getAvailableZoneIds())
        {
        System.out.println(val);
        }

        LocalTime zt = LocalTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("At Singapore : " + zt);
    }
}