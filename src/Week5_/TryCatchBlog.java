package Week5_;

import java.util.Scanner;

public class TryCatchBlog {


    public static void main(String[] args) {

        // Kullanıcıdan indeks almak için Scanner kullanımı
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir indeks giriniz: ");
        int index = input.nextInt();

        // Metodu çağırma
        getElementAtIndex(index);
    }

    static void getElementAtIndex(int x) {
        // 10 elemanlı dizi tanımlama
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try {
            // Belirtilen indeksteki elemanı yazdırma
            System.out.println(array[x]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Hata mesajını yazdırma
            System.out.println(e.getClass().getName() + ": Geçersiz indeks!");
        }
    }
}