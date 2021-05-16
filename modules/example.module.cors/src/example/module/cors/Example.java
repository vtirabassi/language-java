package example.module.cors;

import example.module.utils.Calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Example {

    public static void main(String[] args) throws IOException {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.sum(2, 2));


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());

            System.out.println(br);
            System.out.println(st.nextElement());


    }
}
