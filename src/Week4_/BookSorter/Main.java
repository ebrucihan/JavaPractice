package Week4_.BookSorter;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        // Kitap nesnelerini oluşturma
        Book a = new Book("Harry Potter ve Felsefe Taşı ",276 ,"J.K. Rowling", 2001);
        Book b = new Book("Yüzüklerin Efendisi Yüzük Kardeşliği" , 520 ,"J.R.R. Tolkien" ,2000);
        Book c = new Book("Ben Kirke" , 408,"Madeline Miller",2019);
        Book d = new Book("Gece Yarısı Kütüphanesi", 296,"Matt Haig",2021);
        Book e = new Book("Ay Işığı Sokağı" , 80 ,"Stefan Zweig",2017);

        // Kitapları isimlerine göre sıralayan set yapısı oluşturmq
        TreeSet<Book> nameComparator = new TreeSet<>();
        nameComparator.add(a);
        nameComparator.add(b);
        nameComparator.add(c);
        nameComparator.add(d);
        nameComparator.add(e);

        // Kitapları sayfa sayısına göre sıralayan set yapısı oluşturmq
        TreeSet<Book> pageComparator = new TreeSet<>(Comparator.comparingInt(Book::getNumberOfPage));
        pageComparator.add(a);
        pageComparator.add(b);
        pageComparator.add(c);
        pageComparator.add(d);
        pageComparator.add(e);


        // Kitapları isimlerine göre sıralı olarak ekrana yazdırma
        System.out.println("Kitapların isimlerine göre sıralanması: ");
        for (Book book : nameComparator){
            System.out.println(book.getBookName());
        }

        System.out.println();
        System.out.println("======================================");
        System.out.println();

        // Kitapları sayfa sayılarına göre sıralı olarak ekrana yazdırma
        System.out.println("Kitapların sayfa sayısına göre sıralanması: ");
        for (Book book : pageComparator){
            System.out.println(book.getNumberOfPage() + " sayfa");
        }







    }
}
