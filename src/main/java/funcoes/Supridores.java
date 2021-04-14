package funcoes;

import java.util.function.Supplier;

public class Supridores {
    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> new String();
        System.out.println(stringSupplier.get());
    }
}
