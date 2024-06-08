package Week1;

import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = input.nextInt();

        // Her satır için döngü
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j >= n + i; j++) {
                System.out.print(" ");
            }
            // Yıldızları ekleme
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

