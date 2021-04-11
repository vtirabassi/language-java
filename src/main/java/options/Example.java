package options;

import java.util.Optional;
import java.util.OptionalDouble;

public class Example {
    public static void main(String[] args) {

        Optional<String> optional = Optional.of("valor presente");
        optional.ifPresentOrElse(System.out::println,
                () -> System.out.println("valor nao esta presente"));

        Optional<String> optional1 = Optional.ofNullable(null);
        optional1.ifPresentOrElse(System.out::println,
                () -> System.out.println("valor vazio"));

        Optional<String> optional2 = Optional.empty();
        optional2.ifPresentOrElse(System.out::println,
                () -> System.out.println("valor vazio"));

        OptionalDouble.of(20.5).ifPresent(System.out::println);

    }
}
