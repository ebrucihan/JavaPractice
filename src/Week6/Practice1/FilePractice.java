package Week6.Practice1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
        // Dosya yolunu belirtme
        String path = "./src/Week6/Practice1/patika.txt";

        // Toplamı saklayacak değişken
        int totalSum = 0;

        try {
            // Dosyayı okumak için FileReader oluşturma
            FileReader fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            // Satırı okuyarak döngüyü başlatma
            while ((line = bufferedReader.readLine()) != null) {

                int currentNumber = Integer.parseInt(line);
                totalSum += currentNumber;
            }

        } catch (IOException e) {
            // Hata durumunda hatayı yazdırma
            System.err.println("Dosya okuma hatası : " + e.getMessage());

        }
        //Toplam
        System.out.println("Sayıların toplamı: " + totalSum);


    }
}
