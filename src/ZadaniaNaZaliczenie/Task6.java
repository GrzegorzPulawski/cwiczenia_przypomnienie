package ZadaniaNaZaliczenie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {
    //Napisz metodę, która zwraca łańcuch rozdzielany przecinkami na podstawie podanej
    //listy liczb całkowitych. Każdy element powinien być poprzedzony literą „e”, jeśli liczba
    //jest parzysta, i poprzedzona literą „o”, jeśli liczba jest nieparzysta. Na przykład, jeśli lista
    //danych wejściowych to (3,44), wynikiem powinno być „o3, e44”. Użyj strumieni.



    public static List<String> listaElementow(List<Integer> listaLiczb){
        return listaLiczb.stream()
                .map(s ->s % 2 == 0 ? "e" + s: "o"+ s)
                .collect(Collectors.toList());



    }

    public static void main(String[] args) {
        List<Integer> listaLiczb = Arrays.asList(1,2,3,4);
        List<String> wywolajMetode = listaElementow(listaLiczb);
        System.out.println(wywolajMetode);
    }

}
