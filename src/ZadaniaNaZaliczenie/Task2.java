package ZadaniaNaZaliczenie;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Napisz program, który odbiera rozmiar tablicy (n) od użytkownika (System.in). Następnie
        //odbierz n liczb od użytkownika i umieść je w tablicy. Zaimplementuj algorytm
        //sortowania bąbelkowego, aby posortować tę tablicę w porządku rosnącym.
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj rozmiar tablicy: ");
        int rozmiar = scanner.nextInt();

        int[] tablica = new int[rozmiar];
        System.out.println(Arrays.toString(tablica));
        for (int a = 0; a < rozmiar; a++) {
            System.out.println("Dodaj liczbe do tablicy: ");
            int liczba = scanner.nextInt();

            tablica[a] = liczba;

        }
        System.out.println(Arrays.toString(tablica));
        sortowanieBabelkowe(tablica);
        System.out.println(Arrays.toString(tablica));
    }

     static void sortowanieBabelkowe(int[] tablica) {
        for (int i = 0; i < tablica.length; i++) {

            for (int j = i + 1; j < tablica.length; j++) {

                int liczbaA = tablica[i];
                int liczbaB = tablica[j];

                if (liczbaA > liczbaB) {
                    tablica[i] = liczbaB;
                    tablica[j] = liczbaA;
                }
            }
        }
    }
}