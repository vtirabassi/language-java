package set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args) {

        //nao garante a ordem que inserimos, +performace
        Set<Integer> set = new java.util.HashSet<>();

        set.add(24);
        set.add(18);
        set.add(25);

        System.out.println(set);

        set.remove(18);
        set.add(00);
        set.add(100);
        set.add(24);
        set.add(24);
        set.add(24);
        set.add(null);

        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
