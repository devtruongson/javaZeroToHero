import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLiSach {
    private List<Document> danhSachTaiLieu;

    public QuanLiSach() {
        this.danhSachTaiLieu = new ArrayList<Document>();
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so tai lieu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Moi ban nhap lua chon nhap tai lieu (1.Sach , 2.Tap Chi , 3.Bao , 4.Thoat) : ");
            int option = scanner.nextInt();
            switch (option) {
                case 1: {
                    Book book = new Book();
                    book.Input();
                    this.danhSachTaiLieu.add(book);
                    break;
                }
                case 2: {
                    TapChi tc = new TapChi();
                    tc.Input();
                    this.danhSachTaiLieu.add(tc);
                    break;
                }
                case 3: {
                    Bao Bao = new Bao();
                    Bao.Input();
                    this.danhSachTaiLieu.add(Bao);
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    break;
                }
            }
        }
    }

    public void XuatTaiLieu() {
        for (Document document : danhSachTaiLieu) {
            System.out.println();
            document.Display();
            System.out.println();
        }
    }

    public void SearchDocuments() {
        for (Document document : danhSachTaiLieu) {
            if (document.getSoBanPhatHanh() > 1000) {
                System.out.println();
                document.Display();
                System.out.println();
            }
        }
    }

    public void AddDocument() {
        Document doc = new Document();
        doc.Input();
        this.danhSachTaiLieu.add(0, doc);
    }

    public static void main(String[] args) throws Exception {
        QuanLiSach ql = new QuanLiSach();
        System.out.println("Nhap tai lieu: ");
        ql.Input();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Xuat tai lieu: ");
        System.out.println();
        ql.XuatTaiLieu();
        System.out.println("----------------------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("Tiem kiem tai lieu co so phat ban phat hanh > 1000: ");
        ql.SearchDocuments();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Them 1 tai lieu vao dau day");
        System.out.println();
        ql.AddDocument();
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        System.out.println("Danh sach tai lieu sau khi them 1 tai lieu");
        ql.XuatTaiLieu();
    }
}
