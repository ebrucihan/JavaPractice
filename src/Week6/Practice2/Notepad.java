package Week6.Practice2;

import java.io.*;
import java.util.Scanner;

public class Notepad {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Kullanıcıdan metni almak için Scanner nesnesi oluşturma
        System.out.print("Bir metin giriniz:");
        String text = input.nextLine();

        // Metnin kaydedileceği dosyanın yolu
        String filePath = "./src/Week6/Practice2/note.txt";

        try {

            // Dosyaya yazmak için bir FileWriter ve PrintWriter nesnesi oluşturma
            FileWriter fileWriter = new FileWriter(filePath);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(text);
            printWriter.close();

            // Dosyayı okumak için bir FileReader ve BufferedReader nesnesi oluşturma
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            bufferedReader.close();

            // Okunan metni ekrana yazdırma
            System.out.println("Son kaydedilen metin: " + line);



        } catch (IOException e) {
            // Hata durumunda hatayı ekrana yazdırma
            System.out.println("Dosya okuma hatası : " + e.getMessage());
        }
    }
}
