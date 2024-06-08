package Week1;
import java.util.Scanner;
public class KDVTutariHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz: ");
        double tutar = input.nextDouble();

        double kdvOran;
        if (tutar >= 0 && tutar <= 1000) {
            kdvOran = 0.18;
        } else {
            kdvOran = 0.08;
        }
        double kdvTutar= tutar * kdvOran;
        double kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz Tutar: " + tutar);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

    }
}

