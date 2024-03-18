import java.util.Scanner;

public class Book {
    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten SP :");
        this.bookName = scanner.nextLine();
        System.out.println("Nhap Tac gia SP :");
        this.bookAuthor = scanner.nextLine();
        System.out.println("Nhap producer SP :");
        this.producer = scanner.nextLine();
        System.out.println("Nhap gia SP :");
        this.price = scanner.nextFloat();
        System.out.println("Nhap yearPublishing SP :");
        this.yearPublishing = scanner.nextInt();
    }

    public void display() {
        System.out.println("Nhap Ten SP :" + this.bookName);
        System.out.println("Nhap Tac gia SP :" + this.bookAuthor);
        System.out.println("Nhap gia SP :" + this.price);
        System.out.println("Nhap producer SP :" + this.producer);
        System.out.println("Nhap yearPublishing SP :" + this.yearPublishing);
    }

}
