package functional_interface.Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Desafio5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        OptionalDouble media = numeros.stream()
                                .filter(n -> n > 5)
                                .mapToInt(n -> n)
                                .average();

        if(media.isPresent()){
            System.out.println("A media dos numeros maiores que 5 é: " + media.getAsDouble());
        }
        else{
            System.out.println("Nao ha numeros maiores que 5");
        }            
                               



/*       int somaTotal = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, Integer::sum);

        int qtdNumeros = (int) numeros.stream()
                .filter(n -> n > 5)
                .count();

        System.out.println("A media dos numeros maiores que 5 é:" + somaTotal/qtdNumeros);*/      
    }
}
