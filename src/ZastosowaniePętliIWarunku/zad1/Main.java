package ZastosowaniePętliIWarunku.zad1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = number; i > 0; i--) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
