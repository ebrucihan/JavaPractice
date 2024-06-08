package Week1;

import java.util.Scanner;

public class LoopsKatlariHesaplama {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Sınır sayısını girin: ");
        n = input.nextInt();

        int power4 = 1;
        int power5 = 1;

        // 4'ün kuvvetlerini hesaplayan döngü
        for (int i = 1; i <= n; i *= 4) {
            System.out.println("4'ün kuvveti: " + power4);
            power4 *= 4;
        }

        // 5'in kuvvetlerini hesaplayan döngü
        for (int i = 1; i <= n; i *= 5) {
            System.out.println("5'in kuvveti: " + power5);
            power5 *= 5;
        }
    }
}
