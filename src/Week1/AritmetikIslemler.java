package Week1;
import java.util.Scanner;
public class AritmetikIslemler {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        Scanner input= new Scanner(System.in);
        System.out.print(" 1. değeri giriniz:");
        a = input.nextInt();
        System.out.print(" 2. değeri giriniz:");
        b = input.nextInt();
        System.out.print(" 3. değeri giriniz:");
        c = input.nextInt();

        int IslemSonucu = a+b*c-b;
        System.out.println("İşlem Sonucu:" + IslemSonucu);

    }
}
