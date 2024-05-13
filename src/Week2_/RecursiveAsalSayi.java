package Week2_;

import java.util.Scanner;

public class RecursiveAsalSayi {
    // Verilen bir sayının asal olup olmadığını kontrol eden fonksiyon
    static boolean asal(int number, int i) {
        // Eğer sayı 1 veya daha küçükse, asal değildir
        if (number <= 1)
            return false;

        // Eğer i sayıya eşitse, hiçbir sayıyla bölünmediğimiz için asaldır
        if (i == number)
            return true;



        // Eğer sayı i'ye bölünüyorsa asal değildir

        if (number % i == 0)
            return false;


        // Bir sonraki adıma geçmek için i'yi arttırarak fonksiyonu tekrar çağırma
        return asal(number, +1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = scan.nextInt();


        // Girilen sayının asal olup olmadığını kontrol etme
        if (asal(sayi, 2)) {
            System.out.println(sayi + " sayısı ASAL'dır!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }
}


