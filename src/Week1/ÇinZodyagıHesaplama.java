package Week1;
import java.util.Scanner;
public class ÇinZodyagıHesaplama {
    public static void main(String[] args) {
        int year;
        // Kullanıcıdan doğum yılını almak için bir Scanner oluşturuyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();

        String zodiac = "";

        //Çin Zodyağı burcunu hesaplamak için girilen yılın 12'ye bölümünden kalanına göre bir burç belirlenir.
        //Her kalan değer bir Çin Zodyağı burcuna denk gelir.

        if (year%12 == 0) {
            zodiac ="Maymun";

        } else if (year%12 == 1) {
            zodiac ="Horoz";

        } else if (year%12 == 2)  {
            zodiac = "Köpek";

        } else if (year%12 == 3)  {
            zodiac ="Domuz";

        } else if (year%12 == 4)  {
            zodiac = "Fare";

        }else if (year%12 == 5) {
            zodiac = "Öküz";

        } else if (year%12==6) {
            zodiac = "Kaplan";

        }else if (year%12==7) {
            zodiac = "Tavşan";

        } else if (year%12==8) {
            zodiac = "Ejderha";

        }else if (year%12==9) {
            zodiac = "Yılan";

        }else if (year%12==10) {
            zodiac = "At";

        }else if (year%12==11) {
            zodiac ="Koyun";

        }
        // Hesaplanan Çin Zodyağı burcunu ekrana yazdırıyoruz.
        System.out.println("Çin Zodyağı burcunuz: " + zodiac );






    }
}
