package map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleHashTable {
    public static void main(String[] args) {
        //usado quando se lida com diversas threads, concorrencia de threads
        //Nao é muito utilizavel
        Hashtable<String, Integer> pessoas = new Hashtable<>();

        pessoas.put("Vinicius", 24);
        pessoas.put("Sthefanie", 24);

        System.out.println(pessoas);

        System.out.println(pessoas.size());

        System.out.println("Idade do Vinicius: " + (pessoas.containsKey("Vinicius")
                ? pessoas.get("Vinicius") :
                "Não informado"));

        pessoas.remove("Vinicius");

        Iterator<String> iterator = pessoas.keySet().iterator();

        while (iterator.hasNext()){
            var key = iterator.next();
            System.out.println("Iterator --> " + key + " " + pessoas.get(key));
        }

        for (Map.Entry<String, Integer> element : pessoas.entrySet() ){
            System.out.println("--> " + element);
        }

        for (String key : pessoas.keySet() ){
            System.out.println("---> " + key + " " + pessoas.get(key));
        }
    }
}
