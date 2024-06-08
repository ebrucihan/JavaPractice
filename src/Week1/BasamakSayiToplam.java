package Week1;

import java.util.Scanner;

public class BasamakSayiToplam {
    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();

        int basnumber = 0 , tempNumber = number;
        int basValue;
        int result =0;

        //basamak sayısını bulma işlemi
        while (tempNumber != 0) {
            tempNumber /= 10;
            basnumber++;
        }

        tempNumber = number;
        //Girilen sayının tek tek basamaklarını bulma
        while (tempNumber != 0) {
            basValue = tempNumber %10;
            for(int i = 1 ; i<= basnumber; i++) {

            }

            // Girilen basamakları toplama
            result+=basValue;
            tempNumber /= 10;
        }

        System.out.println("Sayının basamaklarının toplamı: "+ result);
    }
}
