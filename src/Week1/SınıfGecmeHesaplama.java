package Week1;
import java.util.Scanner;
public class SınıfGecmeHesaplama {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;
        int toplam = 0; // Notların toplamını tutmak için değişken
        int notSayisi = 0; // Geçerli notların sayısını tutmak için değişken

        Scanner input = new Scanner(System.in);

        // Her ders notunu alırken kontrol edildi ve toplama eklendi
        // Geçerli notların sayısını belirlendi
        System.out.print("Matematik notunuz:");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplam += mat;
            notSayisi++;
        }

        System.out.print("Fizik notunuz:");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            notSayisi++;
        }

        System.out.print("Türkçe notunuz:");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            toplam += turkce;
            notSayisi++;
        }

        System.out.print("Kimya notunuz:");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            toplam += kimya;
            notSayisi++;
        }

        System.out.print("Müzik notunuz:");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            toplam += muzik;
            notSayisi++;
        }

        // Geçerli notların olup olmadığı kontrol edildi
        if (notSayisi == 0) {
            System.out.println("Hiç geçerli ders notu girilmedi.");
        } else {
            // Ortalama hesaplandı
            double average = (double) toplam / notSayisi;
            if (average < 55) {
                System.out.println("Sınıfta kaldınız :(");
            } else {
                System.out.println("Sınıfı geçtiniz, tebrikler!");
            }
        }
    }
}
