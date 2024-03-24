import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so nhan vien: ");
        int n = scanner.nextInt();
        NhanVien[] nhanViens = new NhanVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ban dang nhap thong tin cho nhan vien thu: " + (i + 1));
            nhanViens[i] = new NhanVien();
            nhanViens[i].NhapNhanVien();
        }

        System.out.println("Thong tin nhan vien ban vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin nhan vien thu: " + (i + 1));
            nhanViens[i].HienThiNhanVien();
            System.out.println(); // cach ra cho dep
        }

        System.out.print("Moi ban nhap ho ten nhan vien can tim: ");
        scanner.nextLine();
        String hoTen = scanner.nextLine();
        timKiemNhanVienTheoTen(hoTen, nhanViens);
        scanner.close();
    }

    public static void timKiemNhanVienTheoTen(String hoten, NhanVien[] nvs) {
        boolean isFounded = false;
        for (int i = 0; i < nvs.length; i++) {
            if (nvs[i].getHoTen().equalsIgnoreCase(hoten)) {
                nvs[i].HienThiNhanVien();
                isFounded = true;
            }
        }
        if (!isFounded) {
            System.out.println("Xin loi chung toi khong tim thay nhan vien nao co ten la: " + hoten);
        }
    }
}
