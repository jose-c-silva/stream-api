package functional_interface.example;

import java.util.List;
//import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SupplierExemplo {
    public static void main(String[] args) {
        //Supplier<String> saudacao = () -> "Olá, seja bem vindo!";

        List<String> listaSaudacao = Stream.generate(()->"Olá").limit(5).collect(Collectors.toList());

        listaSaudacao.forEach(System.out::println);
    }
}
