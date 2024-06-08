package Week1;

import java.util.Scanner;

public class UcgenAlanHesaplama {
    public static void main(String[] args) {
        int a,b,c;


        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz: ");
        a= girdi.nextInt();
        System.out.print("2. Kenarı Giriniz: ");
        b= girdi.nextInt();
        System.out.print("3. Kenarı Giriniz: ");
        c= girdi.nextInt();

        double u = (a+b+c)/ 2;
        double alan = Math.sqrt(u * (u - a)* (u - b) * (u - c));
        System.out.println("Üçgenin Alanı :" + alan );
    }
}

