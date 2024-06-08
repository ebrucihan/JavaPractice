package Week1;
import java.util.Scanner;
public class KullanıcıGirisi {
    public static void main(String[] args) {
        //Kullanıcı adı ve şifre değişkenleri tanımlanıyor
        String userName, passwords;
        // Kullanıcıdan giriş bilgileri alınıyor
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınızı giriniz: ");
        userName = inp.nextLine();
        System.out.print("Şifrenizi giriniz: ");
        passwords = inp.nextLine();
        // Kullanıcı adı ve şifre kontrol ediliyor
        if (userName.equals("EbruCihan") && passwords.equals("java1234")) {
            System.out.println("Giriş Yapıldı.");
        } else {
            // Kullanıcı adı veya şifre hatalıysa kullanıcıya bilgi veriliyor
            System.out.println("Kullanıcı adı veya şifre yanlış");
            System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/ Hayır)");
            // Kullanıcı şifresini sıfırlamak isterse işlem başlatılıyor
            String answer = inp.nextLine();
            if (answer.equalsIgnoreCase("Evet")) {
                System.out.println("Yeni şifrenizi giriniz: ");
                String newPassword = inp.nextLine();
                // // Eski şifre ile yeni şifrenin aynı olup olmadığını kontrol ediliyor
                if (!newPassword.equals(passwords)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");

                }

            }
        }
    }
}
