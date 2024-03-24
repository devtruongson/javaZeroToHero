import java.util.Scanner;

public class NhanVien {
    private String maNV;
    private String hoTen;
    private String que;
    private double heSoLuong;

    public NhanVien() {
    }

    public NhanVien(String maNV, String hoTen, String que, double heSoLuong) {
        this.maNV = maNV;
        this.hoTen = hoTen;
        this.que = que;
        this.heSoLuong = heSoLuong;
    }

    public void NhapNhanVien() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Nhap ma nhan vien: ");
            this.setMaNV(scanner.nextLine());
            System.out.print("Nhap ho ten nhan vien: ");
            this.setHoTen(scanner.nextLine());
            System.out.print("Nhap que quan nhan vien: ");
            this.setQue(scanner.nextLine());
            System.out.print("Nhap he so luong nhan vien: ");
            this.setHeSoLuong(scanner.nextDouble());
        } catch (Exception e) {
            System.err.println("Co loi xay ra: " + e);
            this.NhapNhanVien();
        }
    }

    public void HienThiNhanVien() {
        System.out.println("Ma nhan vien la: " + this.getMaNV());
        System.out.println("Ho ten nhan vien la: " + this.getHoTen());
        System.out.println("Que quan nhan vien la: " + this.getQue());
        System.out.println("He so luong nhan vien la: " + this.getHeSoLuong());
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getQue() {
        return que;
    }

    public void setQue(String que) {
        this.que = que;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

}
