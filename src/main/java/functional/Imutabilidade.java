package functional;

import java.util.function.UnaryOperator;

public class Imutabilidade {

    public static void main(String[] args) {

        int x =  10;
        UnaryOperator<Integer> multiplicaPor2 = valor -> valor * 2;

        System.out.println(multiplicaPor2.apply(x));
        System.out.println(x);
    }
}
