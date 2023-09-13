package ejemplo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        getPalabrasConVocal(Arrays.asList("hola", "zzz", "montiel", "bc"))
                .forEach(System.out::println);


    }
    // 1 Filtrar una lista:
    // Dada una lista de números, utiliza una expresión lambda para filtrar los números pares de la lista.
    public static List<Integer> getPares(List<Integer> numeros) {
        Clazz c = new Clazz();
        return numeros.stream()
                .filter(n -> n%2==0)
                .collect(Collectors.toList());
    }

    // 2 Mapear una lista: Dada una lista de palabras, utiliza una expresión lambda para crear una nueva lista que contenga
    // la longitud de cada palabra en la lista original.

    public static List<Integer> getLens(List<String> palabras) {
        return palabras.stream()
                .map(p -> p.length())
                .collect(Collectors.toList());
        //return palabras.stream()
        // .map(String::length)
        // .collect(Collectors.toList());
    }

    // 3 Reducir una lista: Dada una lista de números, utiliza una expresión lambda y la función reduce para calcular
    // la suma de todos los números en la lista.

    public static int sumatorio(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (a, b) -> a+b);
        // return numbers.stream()
        // .reduce(0, Integer::sum);

    }

    // 4 Ordenar una lista: Dada una lista de cadenas de texto, utiliza una expresión lambda y la
    // función sorted para ordenar las cadenas alfabéticamente.

    public static List<String> ordenar(List<String> palabras) {
        return palabras.stream()
                .sorted(String::compareTo)
                .toList();
        //return palabras.stream()
        // .sorted((a, b) -> a.compareTo(b))
        // .toList();
    }

    // 5 dada una lista calcula el cuadrado de todos los elementos
    public static List<Integer> todosAlCuadrado(List<Integer> numeros) {
        return numeros.stream()
                .map(n -> n*n)
                .toList();
    }

    // 6 Quitar las cadenas que no contengan vocal
    public static List<String> getPalabrasConVocal(List<String> lista) {
        return lista.stream().
                filter(Clazz::tieneVocal).
                collect(Collectors.toList());
        //return lista.stream().
        // filter(a -> ejemplo1.Clazz.tieneVocal(a)).
        // collect(Collectors.toList());
    }
}
