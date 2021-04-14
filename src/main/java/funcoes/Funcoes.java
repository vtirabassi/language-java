package funcoes;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args) {
        Function<String, Integer> function = text -> {
            //regra para validar int
            Integer.valueOf(text);
            return  Integer.valueOf(text);
        };
        System.out.println(function.apply("5"));
    }
}
