package Week1;
import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        //Değişkenler belirleniyor.
        int n1,n2,select;

        Scanner input = new Scanner(System.in);
        System.out.print("1.değeri giriniz:");
        n1= input.nextInt();
        System.out.print("2.değeri giriniz: ");
        n2=input.nextInt();
        //Kullanıcıya hangi işlemi yapmak istediğini sormak için menü gösteriliyor.
        System.out.println("1-Toplama İşlemi\n2-Çıkarma İşlemi\n3-Çarpma İşlemi\n4-Bölme İşlemi");
        System.out.print("Seçim Yapınız: ");
        select= input.nextInt();
        //Kullanıcının seçimine göre işlem yapılıyor.
        switch (select) {
            case 1:
                System.out.println("Toplam: " + (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma: " + (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma: " + (n1*n2));
                break;
            case 4:
                // Eğer bölünen sıfıra eşit değilse bölme işlemi yapılıyor ve sonuç ekrana yazdırılıyor.
                // Eğer bölünen sıfıra eşitse hata mesajı yazdırılıyor.
                if(n2!=0) {
                    System.out.println("Bölme:" + (n1 / n2));
                }else {
                    System.out.println("Bir sayı 0'a bölünemez!");
                }
                break;
            // Geçersiz bir seçim yapıldığında hata mesajı yazdırılıyor.
            default:
                System.out.println("Yanlış seçim yaptınız, tekrar deneyiniz.");

        }
    }
}
