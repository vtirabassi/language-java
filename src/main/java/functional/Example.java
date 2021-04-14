package functional;

import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {

        UnaryOperator<Integer> calc2 = value -> value *2;
        int x = 10;

        System.out.println(calc2.apply(x));
    }
}
