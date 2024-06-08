
package Week1;
import java.util.Scanner;
public class VucutKitleEndeksHesaplama {
  public static void main(String[] args) {
      // kullanıcı değerlerini tanımlıyoruz
      double kg;
      double boy;

      Scanner girdi = new Scanner(System.in);
      System.out.print("Lütfen kilonuzu giriniz: ");
      kg = girdi.nextDouble();
      System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz:" );
      boy = girdi.nextDouble();

      // hesaplama kısmı
      double indeks = kg / (boy * boy);
      System.out.println("Vücut Kitle Endeksiniz: " + indeks);

  }
}
