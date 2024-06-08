package Week1;

import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
// 1 1 2 3 5 8 13....
        // İlk iki Fibonacci terimi
        int a =1;
        int b =1;
        int c;

        int n ;
        Scanner input = new Scanner(System.in);
        System.out.print  ( "Eleman Sayısını Giriniz: ");
        n = input.nextInt();

        // İlk iki terimi yazdırmak için ayrı ayrı kontrol yapılır
        if (n >= 1) {
            System.out.println(a);
        }
        if (n >= 2) {
            System.out.println(b);
        }

        // Fibonacci serisinin geri kalan elemanlarını hesaplama ve yazdırma
        for (int i =2; i<n; i++) {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

        }

    }
