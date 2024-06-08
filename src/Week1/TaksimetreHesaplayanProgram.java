package Week1;

import java.util.Scanner;
public class TaksimetreHesaplayanProgram {
    public static void main (String[] args) {
        int km;
        double perkm = 2.20, total , starPrice = 10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM Cinsinden Giriniz: ");
        km = (input.nextInt());

        total= (km + perkm);
        total += starPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam tutar : " + total);
    }

}
