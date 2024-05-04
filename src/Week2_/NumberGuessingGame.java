package Week2_;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Rastgele bir sayı üretmek için Random sınıfını kullanıyoruz.
        Random rand = new Random();
        int number = rand.nextInt(100);


        Scanner scan = new Scanner(System.in);
        // Doğru tahmin sayısını saklayacak değişken.
        int right = 0;
        // Kullanıcının seçtiği sayıyı saklayacak değişken.
        int selected;
        // Yanlış tahminleri saklamak için dizi oluşturuyoruz.
        int[] wrong = new int[5];
        // Oyunun kazanılıp kazanılmadığını kontrol etmek için boolean değişkenler.
        boolean isWin = false;
        boolean isWrong = false;

        // 5 hakkı olduğu için bu döngü 5 kez çalışacak.
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz: ");
            selected = scan.nextInt();

            // Kullanıcının girdiği sayı 0-99 arasında değilse uyarı veriyoruz.
            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                // Eğer kullanıcı daha önce yanlış giriş yaptıysa, bu sefer bir hak düşürüyoruz.
                if (isWrong) {
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - (++right)));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir. ");

                }
                continue;
            }
            // Kullanıcının girdiği sayı doğruysa oyunu kazandığını belirtiyoruz.
            if (selected == number) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı:  " + number);
                isWin = true;
                break;

                // Kullanıcının girdiği sayı yanlışsa, daha büyük ya da daha küçük olduğunu söylüyoruz.
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (selected > number) {
                    System.out.println(selected + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = selected;
                // Kalan hakkı kullanıcıya bildiriyoruz.
                System.out.println("Kalan hakkınız : " + (5 - right));
            }

        }
        // Eğer oyun kazanılmadıysa sonuçları gösteriyoruz.
        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            // Eğer hiç hatalı giriş yapılmadıysa yanlış tahminleri gösteriyoruz.
            if (!isWrong) {
                System.out.println("Tahminleriniz: " + Arrays.toString(wrong));
            }

            // Gizli sayıyı gösteriyoruz.
            System.out.println( "Gizli Sayı: " + number);

        }
    }
}
