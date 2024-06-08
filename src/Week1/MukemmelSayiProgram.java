package Week1;

import java.util.Scanner;

public class MukemmelSayiProgram {
    public static void main(String[] args) {
        int n;
        // Kullanıcıdan bir sayı girişi istenir.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        n = input.nextInt();
        int total = 0;

        // Sayının bölenlerinin toplamı hesaplanır.
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                total += i;
            }
        }
        if (total == n) {
            System.out.println(n + " mükemmel sayıdır.");
        } else {
            System.out.println(n + " mükemmel sayı değildir.");
        }

    }
}
