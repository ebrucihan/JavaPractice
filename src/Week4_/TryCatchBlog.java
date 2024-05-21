package Week4_;

import java.util.Scanner;

public class TryCatchBlog {


    public static void main(String[] args) {

        // 10 elemanlı dizi tanımlama
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Kullanıcıdan indeks almak için Scanner kullanımı
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir indeks giriniz: ");
        int index = input.nextInt();

        // Metodu çağırma ve sonucu yazdırma
        String result = getElementAtIndex(array, index);
        System.out.println(result);
    }

    public static String getElementAtIndex(int[] array, int index) {
        try {
            // Belirtilen indeksteki elemanı döndürme
            int element = array[index];
            return "Dizinin " + index + ". indeksindeki eleman: " + element;
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata mesajını döndürme
            return "Hata: Geçersiz indeks. Lütfen 0 ile 9 arasında bir değer girin!";
        }
    }
}