package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        //preservar a ordem que inserimos, -performace que HashSet
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(24);
        set.add(18);
        set.add(25);

        System.out.println(set);

        set.remove(18);

        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(set.isEmpty());
    }
}
