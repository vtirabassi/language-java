package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {

        //a ordem é estabelecida pelo algoritimo do TreeMap, -performace
        TreeMap<String, String> paises = new TreeMap<>();

        paises.put("BR", "Brasil");
        paises.put("EUA", "Estados Unidos");

        System.out.println(paises);

        System.out.println(paises.firstKey());

        System.out.println(paises.firstEntry().getKey() + "--" + paises.firstEntry().getValue());

        System.out.println("Pais EUA: " + (paises.containsKey("EUA")
                ? paises.get("EUA") :
                "Não possui"));

        paises.remove("EUA");

        System.out.println(paises.size());

        Iterator<String> iterator = paises.keySet().iterator();

        while (iterator.hasNext()){
            var key = iterator.next();
            System.out.println("Iterator --> " + key + " " + paises.get(key));
        }

        for (Map.Entry<String, String> element : paises.entrySet() ){
            System.out.println("--> " + element);
        }

        for (String key : paises.keySet() ){
            System.out.println("---> " + key + " " + paises.get(key));
        }
    }
}
