package comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example {

    public static void main(String[] args) {

        List<Estudante> list = new ArrayList<>();
        list.add(new Estudante("Vinicius", 24));
        list.add(new Estudante("Ana", 34));
        list.add(new Estudante("Sthefanie", 24));
        list.add(new Estudante("Joao", 15));



        System.out.println(list);

        list.sort((x, y) -> x.getIdade() - y.getIdade());
        System.out.println(list);

        list.sort(Estudante::compareTo);
        System.out.println(list);

        list.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new EstudanteComparatorRevers());
        System.out.println(list);
    }
}
