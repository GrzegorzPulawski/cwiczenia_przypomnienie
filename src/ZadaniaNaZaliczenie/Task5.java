package ZadaniaNaZaliczenie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Task5 {
    //Mając listę stringów, napisz metodę, która zwraca listę wszystkich ciągów zaczynających
    //się na literę „a” (małe litery) i zawierających dokładnie 3 litery, użyj strumieni.


    public static List<String> nazwaNaA(List<String> listaStringow){
       return listaStringow.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length()==3)
                .collect(Collectors.toList());

    }

    public static void main(String[] args) {
        List<String> listaStringow = Arrays.asList("ala","maja", "czesia");
        List<String> wywolajMetode = nazwaNaA(listaStringow);
        System.out.println(wywolajMetode);
    }

}
