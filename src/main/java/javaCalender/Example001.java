package javaCalender;

import java.util.Calendar;

public class Example001 {

    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        System.out.println(today);

        System.out.println("A data de hoje é: " + today.getTime());

        today.add(Calendar.DATE, 2);
        System.out.println("A data daqui 2 dias é: " + today.getTime());

        today.add(Calendar.MONTH, 2);
        System.out.println("A data daqui 2 meses é: " + today.getTime());

        today.add(Calendar.YEAR, 2);
        System.out.println("A data daqui 2 anos é: " + today.getTime());

        System.out.printf("%tF\n", today);



    }

}
