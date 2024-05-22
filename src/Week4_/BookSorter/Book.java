package Week4_.BookSorter;

public class Book implements Comparable <Book> {

    private String bookName;
    private int numberOfPage;
    private String authorName;
    private int date;

    //Constructor
    public Book(String bookName, int numberOfPage, String authorName, int date) {
        this.bookName = bookName;
        this.numberOfPage = numberOfPage;
        this.authorName = authorName;
        this.date = date;
    }

    //Kitapları ada göre (A-Z) sıralamak için compareTo metodu yazma
    @Override
    public int compareTo(Book o) {
        return this.bookName.compareTo(o.bookName);
    }

    public String getBookName() {
        return bookName;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getDate() {
        return date;
    }
}



