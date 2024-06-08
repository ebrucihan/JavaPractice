package Week1;
import java.util.Scanner;
public class ManavKasaProgramı {
    public static void main(String[] args) {
        // Değerlerin fiyatlarını tanımladığımız bölüm
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat= 0.95;
        double patlıcanFiyat= 5.00;

        //Kullanıcıdan değer aldığımız bölüm
        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        double armutKg = input.nextDouble();
        System.out.println("Elma Kaç Kilo?");
        double elmaKg = input.nextDouble();
        System.out.println("Domates kaç kilo? ");
        double domatesKg= input.nextDouble();
        System.out.println("Muz kaç kilo?");
        double muzKg= input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        double patlıcanKg = input.nextDouble();

       //Toplam tutarın hesaplanması
        double ToplamTutar = (armutFiyat*armutKg)+ (elmaFiyat*elmaKg)+(domatesFiyat*domatesKg)+(muzFiyat*muzKg)+(patlıcanFiyat*patlıcanKg);

        System.out.println("Toplam Tutar:" + ToplamTutar + "TL");
    }
}
