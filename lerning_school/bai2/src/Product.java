import java.util.Scanner;

public class Product {
    private String maHH;
    private String tenHH;
    private float soLuong;
    private float donGia;

    public Product() {
    }

    public Product(String maHH, String tenHH, float soLuong, float donGia) {
        this.maHH = maHH;
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaHH() {
        return maHH;
    }

    public void setMaHH(String maHH) {
        this.maHH = maHH;
    }

    public String getTenHH() {
        return tenHH;
    }

    public void setTenHH(String tenHH) {
        this.tenHH = tenHH;
    }

    public float getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(float soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ma HH :");
        this.maHH = scanner.nextLine();
        System.out.println("Nhap Ten HH :");
        this.tenHH = scanner.nextLine();
        System.out.println("Nhap Don Gia :");
        this.donGia = scanner.nextFloat();
    }

    public void Display() {
        System.out.println("Ma HH : " + this.maHH);
        System.out.println("Ten HH : " + this.tenHH);
        System.out.println("don gia : " + this.donGia);
    }

}