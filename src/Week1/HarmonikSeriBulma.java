package Week1;

import java.util.Scanner;

public class HarmonikSeriBulma {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("n sayısını giriniz: ");
        n= input.nextInt();
        double result = 0.0;

        for(double i =1 ; i<=n; i++) {
            result += (1/i);
        }

        System.out.print("Sonuç: " +result);

    }
}
