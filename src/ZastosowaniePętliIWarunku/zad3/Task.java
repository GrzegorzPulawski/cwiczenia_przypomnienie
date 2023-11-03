package ZastosowaniePętliIWarunku.zad3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int potega = 1;
        int i = 0;
        if (n == 1) {
            System.out.println(1);
        } else {
            for (; potega < n / 2; ) {

                potega = (int) Math.pow(2, i);
                i++;
                System.out.println(potega);
            }
        }
    }
}
