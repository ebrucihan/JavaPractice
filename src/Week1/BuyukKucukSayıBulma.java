package Week1;

import java.util.Scanner;

public class BuyukKucukSayıBulma {
    public static void main(String[] args) {
        int n,k;
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        n = input.nextInt();

        // Kullanıcıdan n tane sayıyı girmesini isteyen döngü
        for(int i=1; i<=n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            k = input.nextInt();

            // Girilen sayıyı en büyük veya en küçük olarak güncelleyen koşullar

            if (k> enBuyuk) {
                enBuyuk = k;
            }
            if (k < enKucuk) {
                enKucuk = k;
            }
        }

        // En büyük ve en küçük sayıları ekrana yazdıran bölüm
        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);



    }
}
