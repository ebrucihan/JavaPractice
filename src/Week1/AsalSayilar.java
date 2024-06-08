package Week1;

public class AsalSayilar {
    public static void main(String[] args) {
        int number, counter;

        // 1'den 100'e kadar olan sayıları kontrol etme
        for (number = 1; number <= 100; number++) {
            counter = 0;
            // Sayıyı 1'den başlayarak kendisine kadar olan tüm sayılarla kontrol etme
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println( "Asal Sayı:  " + number);
            }
        }
    }
}