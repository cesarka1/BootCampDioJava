package functional_interface.Exemples;

import java.util.List;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        List<String> listaSaudacoes = Stream.generate(
                () -> "Olá, seja bem-vinda(a)!"
        ).limit(3).toList();
       
        listaSaudacoes.forEach(System.out::println);
    }
}
