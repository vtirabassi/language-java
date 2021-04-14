package functional;

import java.util.function.BiPredicate;

public class FuncoesPuras {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> verificarSeMaior = (valor1, valor2) -> valor1 > valor2;

        System.out.println(verificarSeMaior.test(13, 12));
        System.out.println(verificarSeMaior.test(13, 12));
    }
}
