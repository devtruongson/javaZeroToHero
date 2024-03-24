import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap so sinh vien: ");
        int n = scanner.nextInt();
        SinhVien[] sinhViens = new SinhVien[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Ban dang nhap thong tin cho sinh vien thu: " + (i + 1));
            sinhViens[i] = new SinhVien();
            sinhViens[i].NhapSinhVien();
        }

        System.out.println("Thong tin sinh vien ban vua nhap la: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Thong tin sinh vien thu: " + (i + 1));
            sinhViens[i].HienThiSinhVien();
            System.out.println(); // cach ra cho dep
        }

        System.out.println("Sinh vien duoc xap xep theo tang dan: ");
        sapXepTheoMaSinhVien(sinhViens);
        scanner.close();
    }

    public static void sapXepTheoMaSinhVien(SinhVien[] svs) {
        for (int i = 0; i < svs.length; i++) {
            int index = i;
            for (int j = i + 1; j < svs.length; j++) {
                if (svs[index].getMaSV() > svs[j].getMaSV()) {
                    index = j;
                }
            }
            if (index != i) {
                SinhVien tam = svs[index];
                svs[index] = svs[i];
                svs[i] = tam;
            }
        }

        for (int i = 0; i < svs.length; i++) {
            svs[i].HienThiSinhVien();
            System.out.println();
        }

    }
}
