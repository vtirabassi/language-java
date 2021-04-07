package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example001 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Vinicius");
        list.add("Sthefanie");
        list.add("Anderson");

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        list.set(2, "Amanda");

        System.out.println(list);

        String firstName = list.get(0);

        System.out.println(firstName);

        System.out.println(list.size());

        for (String item: list) {
            System.out.println("--> " + item);
        }

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println("---> " + iterator.next());
        }
    }
}
