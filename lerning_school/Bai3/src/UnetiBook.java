import java.util.Scanner;

public class UnetiBook extends Book {
    private String language;
    private int semester;

    public UnetiBook() {
        super(); // default khong goi supper van tu dong
    }

    public UnetiBook(String bookName, String bookAuthor, String producer, int yearPublishing, float price,
            String language, int semester) {
        super(bookName, bookAuthor, producer, yearPublishing, price);
        this.language = language;
        this.semester = semester;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap language: ");
        this.language = scanner.nextLine();
        System.out.println("Nhap lsemesteranguage: ");
        this.semester = scanner.nextInt();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Nhap language: " + this.language);
        System.out.println("Nhap lsemesteranguage: " + this.semester);
    }

    public static void main(String[] args) {
        int n = 0, k = 0;
        Scanner scanner = new Scanner(System.in);
        UnetiBook[] books = null;
        do {
            Menu();
            System.out.print("Nhap option (k) :");
            k = scanner.nextInt();
            switch (k) {
                case 1:
                    System.out.println("Nhap so luong sach :");
                    n = scanner.nextInt();
                    books = new UnetiBook[n];
                    for (int i = 0; i < n; i++) {
                        books[i] = new UnetiBook();
                        books[i].input();
                    }
                    break;
                case 2:
                    if (books != null) {
                        System.out.println("Thông tin vừa nhập :");
                        for (int i = 0; i < n; i++) {
                            books[i].display();
                        }
                        break;
                    } else {
                        System.out.println("Chua co sach ban hay nhap sach");
                    }

                case 3: {
                    System.out.println("Thông tin giảm dần theo năm xuất bản: ");
                    SortDESCYear(books);
                    for (int i = 0; i < n; i++) {
                        books[i].display();
                    }
                    break;
                }
                case 4: {
                    System.out.println("Nhap ten sach can tim: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    UnetiBook book = searchBook(name, books, "nameBook");
                    if (book != null) {
                        book.display();
                    } else {
                        System.out.println("Sach cua ban khong tim thay");
                    }
                    break;
                }

                case 5: {
                    System.out.println("Nhap ten tac gia sach can tim: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    UnetiBook book = searchBook(name, books, "authorBook");
                    if (book != null) {
                        book.display();
                    } else {
                        System.out.println("Sach cua ban khong tim thay");
                    }
                    break;
                }

                case 6: {
                    break;
                }
            }

        } while (k != 6);
        scanner.close();
    }

    private static void Menu() {
        System.out.println("1. Nhập thông tin n cuốn sách của Uneti");
        System.out.println("2. Hiển thị thông tin vừa nhập");
        System.out.println("3. Sắp xếp thông tin giảm dần theo năm xuất bản và hiển thị");
        System.out.println("4. Tìm kiếm theo tên sách");
        System.out.println("5. Tìm kiếm theo tên tác giả");
        System.out.println("6. Thoát.");
    }

    private static void SortDESCYear(UnetiBook[] books) {
        for (int i = 0; i < books.length; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getYearPublishing() < books[j].getYearPublishing()) {
                    UnetiBook bookSaveRam = books[i];
                    books[i] = books[j];
                    books[j] = bookSaveRam;
                }
            }
        }
    }

    private static UnetiBook searchBook(String nameSearch, UnetiBook[] books, String type) {
        if (type.equals("nameBook")) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookName().equals(nameSearch)) {
                    return books[i];
                }
            }
        } else if (type.equals("authorBook")) {
            for (int i = 0; i < books.length; i++) {
                if (books[i].getBookAuthor().equals(nameSearch)) {
                    return books[i];
                }
            }
        }
        return null;

    }
}
