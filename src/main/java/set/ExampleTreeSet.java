package set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExampleTreeSet {
    public static void main(String[] args) {

        //a ordem é estabelecida pelo algoritimo do TreeSet, -performace
        //Toda modificacao do meu TreeSet é disparado uma nova ordenaçao, mas a leitura é mais performatica
        TreeSet<String> set = new TreeSet<>();

        set.add("Bahia");
        set.add("Mato Grosso");
        set.add("São Paulo");
        set.add("Rio de Janeiro");
        set.add("Santa Catarina");

        System.out.println(set);

        //Retorna o primeiro elemento e elemina o da fila
        System.out.println(set.pollFirst());

        //Retorna o ultimo elemento e elemina o da fila
        System.out.println(set.pollLast());

        //Retorna o elemento abaixo do elemento informado
        System.out.println(set.lower("Rio de Janeiro"));
        //Retorna o elemento a cima do elemento informado
        System.out.println(set.higher("Rio de Janeiro"));

        System.out.println(set);

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()){
            System.out.println("-->" + iterator.next());
        }

        System.out.println(set.isEmpty());
    }
}
