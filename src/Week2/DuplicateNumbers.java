package Week2;

public class DuplicateNumbers {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        int [] list = {3,4,7,8,6,1,2,3,2,12,4,9,12};
        int [] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    count++;
                }
            }
            if (count > 1 && list[i] % 2 == 0) { // İki kere tekrar eden ve çift olan sayıları kontrol ediyoruz.
                if (!isFind(duplicate, list[i])) {
                    duplicate[startIndex++] = list[i];
                }
            }
        }

        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);

            }
        }
    }
}
