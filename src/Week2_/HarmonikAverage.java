package Week2_;


public class HarmonikAverage {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double result = 0.0;
        for (int i = 0; i < list.length; i++) {
            result = result + (1.0 / list[i]);

        }

        double harmonikAverage = list.length / result;
        System.out.println("Dizinin harmonik ortalaması: " + harmonikAverage);

       }
    }
