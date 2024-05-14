package Week2_;

import java.util.Scanner;

public class RecursiveÜslüSayi {

    // Recursive üs hesaplama fonksiyonu
    static int power(int a,int b) {

        // Eğer üs 0 ise, sonuç 1'dir (a*0 = 1)
        if (b == 0) {
            return 1;
        }
        // Eğer üs 1 ise, sonuç tabanın kendisidir (a*1 = a)

        if (b == 1) {
            return a;
        }
        // Özyinelemeli olarak üs hesaplama
        return a * power(a, b-1);
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
