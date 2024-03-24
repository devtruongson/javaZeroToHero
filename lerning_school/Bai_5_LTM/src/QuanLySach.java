import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class QuanLySach {
    private List<TaiLieu> danhSachTaiLieu; // doc them thong tin ve List: https://www.javatpoint.com/java-list
    private Map<String, Class<? extends TaiLieu>> documentTypes;
    /*
     * Tài liệu về Map , wildcards
     * https://www.geeksforgeeks.org/wildcards-in-java/
     * https://viettuts.vn/java-collection/map-trong-java
     */

    public QuanLySach() {
        this.danhSachTaiLieu = new ArrayList<TaiLieu>();
        this.documentTypes = new HashMap<>();
        documentTypes.put("Sach", Sach.class);
        documentTypes.put("TapChi", TapChi.class);
        documentTypes.put("Bao", Bao.class);
    }

    private void StartApp() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            Menu();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    this.Input(scanner);
                    break;
                case 2:
                    this.Output();
                    break;
                case 3:
                    scanner.nextLine();
                    SearchByType(scanner);
                    break;
                case 4:
                    scanner.nextLine();
                    SearchByAuthorExact(scanner);
                    break;
                case 5:
                    scanner.nextLine();
                    SearchByAuthorNoExact(scanner);
                    break;
            }
        } while (option != 6);
        scanner.close();
    }

    private void Input(Scanner scanner) {
        System.out.print("Ban hay nhap vao so luong tai lieu: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin ve cac tai lieu (1.Sach 2.Tap Chi 3.Bao)");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    Sach s = new Sach();
                    s.Input();
                    this.danhSachTaiLieu.add(s);
                    break;
                case 2:
                    TapChi tc = new TapChi();
                    tc.Input();
                    this.danhSachTaiLieu.add(tc);
                    break;
                case 3:
                    Bao bao = new Bao();
                    bao.Input();
                    this.danhSachTaiLieu.add(bao);
                    break;

            }
        }
    }

    private void Output() {
        if (this.danhSachTaiLieu.isEmpty()) {
            System.out.println("Ban hay nhap tai lieu truoc");
        } else {
            System.out.println("Thong tin tai lieu ban da nhap la: ");
            for (TaiLieu tl : this.danhSachTaiLieu) {
                tl.Output();
            }
        }
    }

    private void SearchByType(Scanner scanner) {
        if (this.danhSachTaiLieu.isEmpty()) {
            System.out.println("Ban hay nhap tai lieu truoc");
        } else {
            System.out.println("Moi ban nhap loai sach: (Sach, TapChi, Bao): ");
            String option = scanner.nextLine();
            Class<? extends TaiLieu> type = documentTypes.get(option);
            if (type != null) {
                for (TaiLieu tl : danhSachTaiLieu) {
                    if (type.isInstance(tl)) {
                        tl.Output();
                    }
                }
                /*
                 * Trong đoạn mã `type.isInstance(tl)`, `isInstance()` là một phương thức của
                 * đối tượng `Class`. Phương thức này được sử dụng để kiểm tra xem một đối tượng
                 * có thuộc về một lớp cụ thể hay không. Trong trường hợp này, `type` là một đối
                 * tượng `Class` đại diện cho một loại tài liệu cụ thể (ví dụ: `Sach`, `Bao`,
                 * hoặc `TapChi`), và `tl` là một đối tượng `TaiLieu` cụ thể được kiểm tra.
                 * 
                 * Về cách hoạt động của nó:
                 * 
                 * - Phương thức `isInstance()` kiểm tra xem đối tượng `tl` có phải là một thể
                 * hiện của lớp được chỉ định bởi `type` không.
                 * - Nếu `tl` là một thể hiện của lớp được chỉ định, phương thức trả về `true`;
                 * ngược lại, nó trả về `false`.
                 * 
                 * Trong đoạn mã mà bạn đã cung cấp, điều này giúp kiểm tra xem mỗi `TaiLieu`
                 * trong danh sách có phải là loại tài liệu mà người dùng đang tìm kiếm hay
                 * không, dựa trên loại được nhập từ bàn phím.
                 */
            } else {
                System.out.println("Loại tài liệu không hợp lệ.");
            }
        }
    }

    private void SearchByAuthorExact(Scanner scanner) {
        System.out.print("Ban hay nhap ten tac gia: ");
        String tacGia = scanner.nextLine();
        for (TaiLieu tl : this.danhSachTaiLieu) {
            if (tl instanceof Sach && (((Sach) tl).getTenTacGia().equalsIgnoreCase(tacGia))) {
                tl.Output();
            }
        }
    }

    private void SearchByAuthorNoExact(Scanner scanner) {
        System.out.print("Ban hay nhap ten tac gia: ");
        String tacGia = scanner.nextLine();
        for (TaiLieu tl : this.danhSachTaiLieu) {
            if (tl instanceof Sach) {
                if (((Sach) tl).getTenTacGia().indexOf(tacGia) != -1) {
                    tl.Output();
                }

            }
        }
    }

    public static void main(String[] args) {
        QuanLySach sach = new QuanLySach();
        sach.StartApp();
    }

    public void Menu() {
        System.out.println("1. Nhap thong tin ve cac tai lieu (1.Sach 2.Tap Chi 3.Bao)");
        System.out.println("2. Hien thi thong tin ve cac tai lieu");
        System.out.println("3. Tim kiem tai lieu theo loai");
        System.out.println("4. Tim kiem tai lieu theo tên tac gia");
        System.out.println("5. Tim kiem theo tên tac gia “gan dung”");
        System.out.println("6. Hien thi danh sach ve loai tai lieu theo chi dinh cua nguoi su dung");
        System.out.println("7. Thoat");
    }
}
