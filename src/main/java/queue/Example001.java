package queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example001 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Roberto");
        queue.add("Flavia");
        queue.add("Vinicius");
        queue.add("Ana");
        queue.add("Jonh");

        System.out.println(queue);
        System.out.println("primeiro a ser atendido: " + queue.poll());
        System.out.println(queue);

        queue.clear();

        String resp = queue.poll() == null ? "0 clientes" : queue.poll();
        System.out.println("primeiro a ser atendido: " + resp);

    }
}
