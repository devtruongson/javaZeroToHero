import java.util.Scanner;

public class Document {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;

    public Document() {
    }

    public Document(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap ma tai lieu : ");
        this.setMaTaiLieu(scanner.nextLine());
        System.out.print("Moi ban nhap ten nha xuat ban : ");
        this.setNhaXuatBan(scanner.nextLine());
        System.out.print("Moi ban nhap so phat hanh : ");
        this.setSoBanPhatHanh(scanner.nextInt());
    }

    public void Display() {
        System.out.println("Ma tai lieu cua ban la : " + this.getMaTaiLieu());
        System.out.println("Nha xuat ban cua ban la : " + this.getNhaXuatBan());
        System.out.println("So phat hanh tai lieu cua ban la : " + this.getSoBanPhatHanh());
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

}
