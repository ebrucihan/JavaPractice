package Week1;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        int a;
        double b;
        Scanner input =new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        a = input.nextInt();
        System.out.print("Bir ondalıklı sayı giriniz: ");
        b= input.nextDouble();


        // Tam sayıyı ondalıklı sayıya dönüştürelim
        double myInt = (double) a;

        // Ondalıklı sayıyı tam sayıya dönüştürelim
        int myDouble = (int) b;

        System.out.println("Girilen tam sayı: " + a);
        System.out.println("Girilen ondalıklı sayı: " + b);
        System.out.println("Tam sayı, ondalıklı sayıya dönüştürüldüğünde: " + myInt + " olur.");
        System.out.println("Ondalıklı sayı, tam sayıya dönüştürüldüğünde: " + myDouble +" olur.");






    }
}
