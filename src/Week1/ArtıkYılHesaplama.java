package Week1;
import java.util.Scanner;
public class ArtıkYılHesaplama {
    public static void main(String[] args) {
        int year;
        // Kullanıcıdan yılı almak için bir Scanner oluşturuyoruz.
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year= input.nextInt();
        // Artık yıl koşullarını kontrol ediyoruz.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.print(year + " bir artık yıldır!");
        }else {
            System.out.print(year + " bir artık yıl değildir!");
        }
    }
}
