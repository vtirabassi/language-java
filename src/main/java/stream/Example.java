package stream;

import comparators.Estudante;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {

        List<String> list = List.of("Vinicius", "Leandro", "Fabiana");
        List<Object> a = List.of("Vinicius", 1);
        a.forEach(System.out::println);

        System.out.println(list
        .stream().max(Comparator.comparingInt(String::length)));

        System.out.println(list
                .stream()
                .map(s -> s.concat(String.valueOf(s.length())))
                .collect(Collectors.toList()));

        System.out.println(list
        .stream()
        .filter(s -> s.contains("i"))
        .collect(Collectors.toList()));


        System.out.println(list.stream().peek(System.out::println).collect(Collectors.toList()));


        List<Estudante> listEstudante = List.of(
                new Estudante("Vinicius", 17),
                new Estudante("Ronaldo", 44)
        );

        System.out.println(listEstudante
        .stream()
        .filter(estudante -> estudante.getIdade() >= 18)
                .map(Estudante::getNome)
        .collect(Collectors.toList()));
    }
}
