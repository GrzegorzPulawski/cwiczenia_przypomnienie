package OprocentowanieKredytu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Tu zaimplementuj rozwiązanie
        Scanner scanner = new Scanner(System.in);

        double amount = scanner.nextDouble();
        int numberOfInstallments = scanner.nextInt();

        if (amount < 100 || amount > 10000) {

            if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
                double instalmentLow = (5000 * 1.025) / numberOfInstallments;
                System.out.println(instalmentLow);
            } else if ((numberOfInstallments >= 13 && numberOfInstallments <= 24)) {
                double instalmentMedium = (5000 * 1.05) / numberOfInstallments;
                System.out.println(instalmentMedium);
            } else if ((numberOfInstallments >= 25 && numberOfInstallments <= 48)) {
                double instalmentHight = (5000 * 1.10) / numberOfInstallments;
                System.out.println(instalmentHight);
            }   else
            {double instalmenLost = (5000 * 1.10) / 36;
                System.out.println(instalmenLost);
            }
        }else  {
            if (numberOfInstallments >= 6 && numberOfInstallments <= 12) {
                double instalmentLow2 = (amount * 1.025) / numberOfInstallments;
                System.out.println(instalmentLow2);
            } else if (numberOfInstallments >= 13 && numberOfInstallments <= 24) {
                double instalmentMedium2 = (amount * 1.05) / numberOfInstallments;
                System.out.println(instalmentMedium2);
            } else if (numberOfInstallments >= 25 && numberOfInstallments <= 48) {
                double instalmentHight2 = (amount * 1.10) / numberOfInstallments;
                System.out.println(instalmentHight2);
            }
            else
            {double instalmenLost = (amount * 1.10) / 36;
                System.out.println(instalmenLost);
            }
        }
    }
}
