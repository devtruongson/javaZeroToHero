import java.util.Scanner;

public class SinhVienCoKhi extends SinhVien {
    private float diemVeKyThuat;
    private float diemCNC;

    public SinhVienCoKhi() {
    }

    public SinhVienCoKhi(String maSv, String hoVaTen, int namSinh, float diemVeKyThuat, float diemCNC) {
        super(maSv, hoVaTen, namSinh);
        this.diemVeKyThuat = diemVeKyThuat;
        this.diemCNC = diemCNC;
    }

    @Override
    public void Input() {
        try {
            super.Input();
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ban hay nhap diem ve ky thuat: ");
            this.setDiemVeKyThuat(scanner.nextFloat());
            System.out.print("Ban hay nhap diem CNC: ");
            this.setDiemCNC(scanner.nextFloat());
        } catch (Exception e) {
            System.out.println("Ban da nhap sai hay nhap lai tu dau");
            this.Input();
        }

    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Diem ve ky thuat: " + this.getDiemVeKyThuat());
        System.out.println("Diem CNC: " + this.getDiemCNC());
    }

    public float getDiemVeKyThuat() {
        return diemVeKyThuat;
    }

    public void setDiemVeKyThuat(float diemVeKyThuat) {
        this.diemVeKyThuat = diemVeKyThuat;
    }

    public float getDiemCNC() {
        return diemCNC;
    }

    public void setDiemCNC(float diemCNC) {
        this.diemCNC = diemCNC;
    }

    public static void main(String[] args) {
        int n;
        int diemDieuKienLenLop = 5;
        System.out.print("Ban hay nhap so luong sinh vien co khi: ");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        SinhVienCoKhi[] sv = new SinhVienCoKhi[n];
        for (int i = 0; i < n; i++) {
            SinhVienCoKhi svc = new SinhVienCoKhi();
            svc.Input();
            sv[i] = svc;
        }
        System.out.println("Danh Sach Sinh Vien Co Khi: ");
        for (int i = 0; i < n; i++) {
            System.out.println();
            sv[i].Display();
            System.out.println();
        }
        System.out.println("Cac sinh vien duoc len lop: ");
        for (int i = 0; i < n; i++) {
            if (sv[i].getDiemCNC() >= diemDieuKienLenLop && sv[i].getDiemVeKyThuat() >= diemDieuKienLenLop) {
                sv[i].Display();
                System.out.println();
            }
        }

        scanner.close();
    }

}
