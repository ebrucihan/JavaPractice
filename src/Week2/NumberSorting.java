package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        int n;
        // Kullanıcıdan dizinin boyutunu alma
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n: ");
        n = scan.nextInt();

        // Kullanıcıdan alınan boyuta göre bir dizi oluşturma
        int[] list = new int[n];
        // Kullanıcıdan dizinin elemanlarını alma
        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı: ");
            list[i] = scan.nextInt();
        }
        // Diziyi küçükten büyüğe sıralama
        Arrays.sort(list);

        System.out.print("Sıralama: ");
        for (int num : list) {
            System.out.print(num + " ");

        }


    }
}
