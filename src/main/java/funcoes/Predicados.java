package funcoes;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args) {
        Predicate<String> predicate = String::isBlank;
        System.out.println(predicate.test(""));
    }
}
