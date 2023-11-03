package NoweZadanie;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
        //odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
        //sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
        Scanner scanner = new Scanner(System.in);
        int rozmiar = scanner.nextInt();
        System.out.println("podaj");
        int [] tablica = new int[rozmiar];

        for (int a=0; a<rozmiar; a++){
            int liczba = scanner.nextInt();
            tablica[a]=liczba;
        }
    }
}
