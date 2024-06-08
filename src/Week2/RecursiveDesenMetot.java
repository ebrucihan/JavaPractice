package Week2;

import java.util.Scanner;

public class RecursiveDesenMetot {
    public static void RecursiveMethod(int n) {
        // Eğer n 0 veya negatifse, sadece n'i yazdırma
        if (n <= 0) {
            System.out.print(n + " ");
            return;
        }

        System.out.print(n + " ");
        // 5 çıkarma işlemi yaparak RecursiveMethod'i tekrar çağırma
        RecursiveMethod(n - 5);
        // Orijinal sayıyı tekrar yazdırma
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        // Kullanıcıdan bir tamsayı almak için Scanner sınıfını kullanma
        Scanner sc = new Scanner(System.in);
        System.out.print("N değeri : ");
        int n = sc.nextInt();
        RecursiveMethod(n);

    }
}