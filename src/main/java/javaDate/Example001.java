package javaDate;

import java.time.Instant;
import java.util.Date;

public class Example001 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        System.out.println("---------------------------------------");

        Long millisegunds = System.currentTimeMillis();
        Date date2 = new Date(millisegunds);
        System.out.println(date2);

        System.out.println("---------------------------------------");

        Boolean isAfter = date.after(date2);
        Boolean isBefore = date.before(date2);
        System.out.println(isAfter);
        System.out.println(isBefore);

        System.out.println("---------------------------------------");

        Boolean equals = date.equals(date2);
        Integer compare = date.compareTo(date2);
        Integer compareFuture = date2.compareTo(date);
        System.out.println(equals);
        System.out.println(compare);
        System.out.println(compareFuture);

        System.out.println("---------------------------------------");

        Instant instance = date.toInstant();
        System.out.println(instance);




    }
}
