package ZadaniaNaZaliczenie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.stream;

public class StrumienieTask3 {
    public static void main(String[] args) {
        //Napisz metodę, która zwraca średnią z listy liczb całkowitych za pomocą strumieni.

        List<Integer> lista = new ArrayList<>();
        List<Integer> wypelnienieListy = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,20);
        lista.addAll(wypelnienieListy);
        Double srednia = 0.00;
        srednia=
        lista.stream()
                    .mapToInt(liczba -> liczba)
                    .average()
                    .getAsDouble();
        System.out.println(srednia);
        }

}

