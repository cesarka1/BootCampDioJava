package functional_interface.Exemples;

import java.util.Arrays;
import java.util.List;

public class BinaryOpertatorExample {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 6, 7, 8, 9, 10);

        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        System.out.println("A soma dos número é: " + resultado);        
    }

}
