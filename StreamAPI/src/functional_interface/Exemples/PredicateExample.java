package functional_interface.Exemples;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("Java", "Python", "JavaScript");

        palavras.stream()
                .filter(p -> p.length() < 5)
                .forEach(System.out::println);
    }
}
