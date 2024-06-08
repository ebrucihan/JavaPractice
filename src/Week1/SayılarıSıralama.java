package Week1;
import java.util.Scanner;
public class SayılarıSıralama {
    public static void main(String[] args) {
       int a,b,c;

       Scanner input = new Scanner(System.in);
       // Kullanıcıdan üç sayı alınır.
       System.out.print("a sayısını giriniz:");
       a = input.nextInt();

       System.out.print("b sayısını giriniz:");
       b = input.nextInt();

       System.out.print("c sayısını giriniz:");
       c = input.nextInt();
        // Her durum kontrol edilerek sayılar küçükten büyüğe sıralanır.
       if ((c<b) && (c<a)) {
           if (b<a) {
               System.out.println("c<b<a");

           } else {
               System.out.println("c<a<b");
           }
       }else if ((b<c) && (b<a)) {
           if(c<a) {
               System.out.println("b<c<a");
           }else {
               System.out.println(("b<a<c"));
           }
       }else if ((a<c) && (a<b)) {
           if(c<b) {
               System.out.println("a<c<b");
           }else {
               System.out.println("a<b<c");
           }
       }
    }
}
