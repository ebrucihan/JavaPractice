package Week1;
import java.util.Scanner;
public class JavaLoops {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı almak için Scanner oluşturulur.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();

        // Toplam ve sayacı başlatılır.
        int total = 0;
        int count = 0;


        for (int i = 0; i <= n; i++) {
            // Eğer sayı 3 ve 4'e tam bölünüyorsa:
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }

        if (count > 0) {
            // Ortalama hesaplanır.
            double average = (double) total / count;
            System.out.println("0'dan " + n + "'e kadar olan sayıların ortalaması: " + average);
        } else {
            System.out.println("0'dan " + n + "'e kadar hiçbir sayı 3 ve 4'e tam bölünmüyor.");
        }
    }
}
