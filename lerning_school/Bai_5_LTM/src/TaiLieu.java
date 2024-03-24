import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXb;
    private int soBanPhatHanh;

    public TaiLieu() {

    }

    public TaiLieu(String maTaiLieu, String nhaXb, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXb = nhaXb;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap ma tai lieu : ");
        this.setMaTaiLieu(scanner.nextLine());
        System.out.print("Moi ban nhap nha XB tai lieu : ");
        this.setNhaXb(scanner.nextLine());
        System.out.print("Moi ban nhap so ban phat hanh tai lieu : ");
        this.setSoBanPhatHanh(scanner.nextInt());
    }

    public void Output() {
        System.out.println("Ma Tai Lieu : " + this.getMaTaiLieu());
        System.out.println("Nha XB Tai Lieu : " + this.getNhaXb());
        System.out.println("So ban phat hanh Tai Lieu : " + this.getSoBanPhatHanh());
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXb() {
        return nhaXb;
    }

    public void setNhaXb(String nhaXb) {
        this.nhaXb = nhaXb;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }

}