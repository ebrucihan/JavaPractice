package Week1;

import java.util.Scanner;

public class JavaCiftSayiTotal {
    public static void main(String[] args) {

        int a;
        int total = 0;
        // Kullanıcıdan girdi almak için Scanner nesnesi oluşturuldu.
        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Bir sayı giriniz (Programdan çıkmak için 0 giriniz): ");// Kullanıcıya talimat verildi
            a = input.nextInt();
               if (a % 4 == 0) {
                   total += a;  // Eğer koşul sağlanıyorsa, toplama eklenir



               }

        }while (a!=0);

        System.out.print("Çift ve 4'ün katları olan sayıların toplamı :" + total);

        }
    }

