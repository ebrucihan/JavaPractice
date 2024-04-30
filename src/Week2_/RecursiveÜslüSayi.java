package Week2_;

import java.util.Scanner;

public class RecursiveÜslüSayi {

    // Recursive üs hesaplama fonksiyonu
    static int power(int a,int b) {
        int result =1;
        // Her bir üs değeri için tekrarlayan hesaplama
        for(int i =1; i<=b; i++) {
            result*=a;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değerini giriniz: " );
        int base = scan.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int exponent = scan.nextInt();

        // Sonucu ekrana yazdırma
        System.out.println("Sonuç: " + power(base, exponent));

    }
}
