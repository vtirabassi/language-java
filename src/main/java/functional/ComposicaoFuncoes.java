package functional;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class ComposicaoFuncoes {

    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5, 6};

        Arrays.stream(array)
                .filter(i -> i%2 == 0)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
