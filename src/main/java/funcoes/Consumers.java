package funcoes;

import java.util.function.Consumer;

public class Consumers {

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("TESTANDOOOO");
    }
}
