package functional.recursividade;

public class Example {

    public static void main(String[] args) {

        int x = 5;
        System.out.println(fatorial(x));

    }

    public static int fatorial(int x){
        if(x == 1)
            return x;
        else {
            return x * fatorial(x - 1);
        }
    }
}
