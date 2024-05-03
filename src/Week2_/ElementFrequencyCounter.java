package Week2_;

public class ElementFrequencyCounter {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        // Dizi boyunca her bir elemanın tekrar sayısını bulmak için döngü
        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }

            duplicate[i] = count;// Her elemanın tekrar sayısını saklama
        }

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;   // Her elemanın daha önce yazdırılıp yazdırılmadığını kontrol etme
            for (int j = 0; j < i; j++) {
                if (list[i] == list[j]) {
                    isDuplicate = true;
                    break;
                }

            }
            if (!isDuplicate) {
                // Elemanın tekrar sayısını ve kaç kere tekrar edildiğini yazdırma
                System.out.println(list[i] + " sayısı " + duplicate[i] + " kere tekrar edildi.");
            }

        }
    }
}