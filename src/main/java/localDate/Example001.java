package localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Example001 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println(localDate);
        System.out.println("ontem: " + localDate.minusDays(1));
        System.out.println("amanha: " + localDate.plusDays(1));

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
    }
}
