package Week2_;

public class MaxMinValue {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        int number = 5;

        int minCloseNumber = Integer.MIN_VALUE;
        int maxCloseNumber = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < number && i > minCloseNumber) {
                minCloseNumber = i;
            }
            if (i > number && i< maxCloseNumber) {
                maxCloseNumber = i;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + minCloseNumber);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + maxCloseNumber);
    }
}

