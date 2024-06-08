package Week5;

import java.util.HashMap;
import java.util.Scanner;

public class findRepeatWords {
    public static void main(String[] args) {

        String str;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        str = input.nextLine();


        // Girilen metni boşluklara göre ayırma
        String[] s = str.split(" ");

        HashMap<String, Integer> word = new HashMap<>();

        for (String s2 : s) {
            // Kelimenin tamamını küçük harfe çevirme (Büyük-küçük harf duyarlılığını kaldırmak için)
            s2 = s2.toLowerCase();
            if (word.containsKey(s2)) {
                // Kelime varsa, sayısını 1 artırma
                word.put(s2, word.get(s2) + 1);
            } else {
                // Kelime yoksa, HashMap'e ekleme ve sayısını 1 yapma
                word.put(s2, 1);
            }
        }

        // En çok geçen kelime ve sayısını tutacak değişkenler
        String mostFrequentWord = null;
        int maxCount = 0;

        for (HashMap.Entry<String, Integer> entry : word.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        // Sonucu yazdırma
        System.out.println("En çok geçen kelime: " + mostFrequentWord);

            }
        }
        
