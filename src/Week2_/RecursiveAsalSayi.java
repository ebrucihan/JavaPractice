package Week2_;

import java.util.Scanner;

public class RecursiveAsalSayi {
    // Verilen bir sayının asal olup olmadığını kontrol eden fonksiyon
    static boolean asal(int number) {
        // Eğer sayı 1 veya daha küçükse, asal değildir
        if (number <= 1)
            return false;

        // 2'den başlayarak sayının kendisine kadar olan sayılarla bölenini kontrol etme
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0)
                return false; // Bölünürse asal değildir
        }
        return true; // Hiçbir sayıyla bölünmediyse asaldır
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();

        // Girilen sayının asal olup olmadığını kontrol etme
        if (asal(sayi)) {
            System.out.println(sayi + " sayısı ASAL'dır!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }
}