package ZadaniaNaZaliczenie;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        //Napisz metodę, która konwertuje wszystkie ciągi z listy na wielkie litery za pomocą
        //strumieni.
        List<String> lista = Arrays.asList("ada", "kaziu", "czesiu");
        System.out.println(lista);

        lista.stream()
                .map(s -> s.toUpperCase())
                .forEach(s -> System.out.println(s));

        List<String> wywolajMetode = upperCase(lista);
        System.out.println(wywolajMetode);
    }

    public static List<String> upperCase(List<String> lista) {
        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

    }
}
