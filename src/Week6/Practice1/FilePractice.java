package Week6.Practice1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePractice {
    public static void main(String[] args) {
        String path = "./src/Week6/Practice1/patika.txt";
        int totalSum = 0;

        try {
            FileReader fileReader = new FileReader(path);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                int currentNumber = Integer.parseInt(line);
                totalSum += currentNumber;
            }

        } catch (IOException e) {
            System.err.println("Dosya okuma hatası : " + e.getMessage());

        }
        System.out.println("Sayıların toplamı: " + totalSum);


    }
}
