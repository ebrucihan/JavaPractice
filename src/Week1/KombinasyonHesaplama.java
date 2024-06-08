package Week1;

import java.util.Scanner;

public class KombinasyonHesaplama {
    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);

        System.out.print("1.değeri giriniz: ");
        n = input.nextInt();
        System.out.print("2.değeri giriniz: ");
        r = input.nextInt();

        int nfaktoriyel = 1;
        int rfaktoriyel = 1;
        int nrfaktoriyel = 1;

        // n faktöriyeli hesaplama
        for (int i = 1; i <= n; i++) {
            nfaktoriyel *= i;
        }
        // r faktöriyeli hesaplama
        for (int i = 1; i <= r; i++) {
            rfaktoriyel *= i;
        }
        // (n - r) faktöriyeli hesaplama
        for (int i = 1; i <= n - r; i++)
            nrfaktoriyel *= i;
        {
            // Kombinasyon hesaplama
            int kombinasyon = nfaktoriyel / (rfaktoriyel * nrfaktoriyel);
            System.out.println(n + " sayısının " + r + "'li kombinasyonu: " + kombinasyon);


        }
    }
}
