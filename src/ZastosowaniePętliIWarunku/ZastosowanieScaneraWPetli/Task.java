package ZastosowaniePętliIWarunku.ZastosowanieScaneraWPetli;

import java.util.Scanner;

public class Task { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int sum = 0;

    int number = 1;
    for (;number != 0;) {
        number = scanner.nextInt();
        sum = sum + number;
    }
    System.out.println(sum);

    }
}
