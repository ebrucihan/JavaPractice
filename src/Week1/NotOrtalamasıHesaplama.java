package Week1;
import java.util.Scanner;
public class NotOrtalamasıHesaplama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik Notunuz: ");
        matematik= input.nextInt();

        System.out.println("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.println("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.println("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.println("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.println("Müzik Notunuz: ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = (toplam / 6);
        String str = sonuc <60 ? "Kaldı" : "Geçti";
        System.out.println("Ortalamanız : " + sonuc +  str);

    }
}


