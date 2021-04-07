package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ExampleHashMap {
    public static void main(String[] args) {

        //nao garante a ordem que inserimos, +performace
        HashMap<String, Integer> campeosMundiais = new HashMap<>();

        campeosMundiais.put("Brasil", 5);
        campeosMundiais.put("Alemanha", 4);
        campeosMundiais.put("Italia", 4);
        campeosMundiais.put("Argentina", 2);

        System.out.println(campeosMundiais);

        System.out.println("Numero de titulos: " + campeosMundiais.get("Brasil"));

        System.out.println("Numero de titulos: " + (campeosMundiais.containsKey("Estados Unidos")
                ? campeosMundiais.get("Estados Unidos") :
                "Não possui"));

        campeosMundiais.remove("Argentina");

        System.out.println(campeosMundiais.size());

        for (Map.Entry<String, Integer> element : campeosMundiais.entrySet() ){
            System.out.println("--> " + element);
        }

        for (String key : campeosMundiais.keySet() ){
            System.out.println("---> " + key + " " + campeosMundiais.get(key));
        }
    }
}
