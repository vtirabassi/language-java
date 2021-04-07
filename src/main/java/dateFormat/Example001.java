package dateFormat;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Example001 {
    public static void main(String[] args) {
        Date now = new Date();

        String dateFormat = DateFormat.getDateInstance().format(now);
        System.out.println(dateFormat);

        String dateStr = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT).format(now);
        System.out.println(dateStr);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String format = simpleDateFormat.format(now);
        System.out.println(format);

    }
}
