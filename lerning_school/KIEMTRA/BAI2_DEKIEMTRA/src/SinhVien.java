import java.util.Scanner;

public class SinhVien {
    private long maSV;
    private String hoTen;
    private int ngaySinh;
    private String gioiTinh;
    private String diaChi;

    SinhVien() {
    }

    public SinhVien(long maSV, String hoTen, int ngaySinh, String gioiTinh, String diaChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public void NhapSinhVien() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma sinh vien: ");
            this.setMaSV(scanner.nextLong());
            System.out.print("Nhap ho ten sinh vien: ");
            scanner.nextLine();
            this.setHoTen(scanner.nextLine());
            System.out.print("Nhap ngay sinh sinh vien: ");
            this.setNgaySinh(scanner.nextInt());
            System.out.print("Chon gioi tinh sinh vien (1.Nam 2.Nu): ");
            int gtinh = scanner.nextInt();
            this.setGioiTinh(gtinh == 1 ? "Nam" : "Nu");
            System.out.print("Nhap dia chi sinh vien: ");
            scanner.nextLine();
            this.setDiaChi(scanner.nextLine());
        } catch (Exception e) {
            System.err.println("Co loi xay ra: " + e);
            this.NhapSinhVien();
        }
    }

    public void HienThiSinhVien() {
        System.out.println("Ma sinh vien: " + this.getMaSV());
        System.out.println("Ho ten sinh vien: " + this.getHoTen());
        System.out.println("Ngay sinh sinh vien: " + this.getNgaySinh());
        System.out.println("Gioi tinh sinh vien: " + this.getGioiTinh());
        System.out.println("Dia chi sinh vien: " + this.getDiaChi());

    }

    public long getMaSV() {
        return maSV;
    }

    public void setMaSV(long maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

}