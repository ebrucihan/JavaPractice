package Week1;
import java.util.Scanner;
public class HavaSıcaklıgıEtkinlik {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        // Kullanıcıdan sıcaklık girişi istenir.
        System.out.print("Sıcaklığı giriniz:");
        heat = input.nextInt();

        // Sıcaklık 5'ten küçükse kayak yapmaya gitmeyi önerir.
        if (heat<5) {
            System.out.println("Kayak yapmaya gidebilirsiniz");
        //Sıcaklık 5 ile 15 arasındaysa sinemaya gitmeyi önerir.
        } else if (heat>=5 && heat<15) {
            System.out.println("Sinemaya gidebilirsiniz");
        //Sıcaklık 15 olduğunda iki durumuda karşılar.
        } else if (heat == 15) {
            System.out.println("Sinemaya veya pikniğe gidebilirsiniz");
        //Sıcaklık 15 ile 25 arasındaysa pikniğe gitmeyi önerir.
        } else if (heat >= 15 && heat <= 25) {
            System.out.println("Pikniğe gidebilirsiniz");
        //Diğer durumlarda yüzmeye gitmeyi önerir.
        } else {
            System.out.println("Yüzmeye gidebilirsiniz");
        }

    }
}
