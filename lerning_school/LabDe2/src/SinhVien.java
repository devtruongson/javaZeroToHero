import java.util.Scanner;

public class SinhVien {
    private String maSv;
    private String hoVaTen;
    private int namSinh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoVaTen, int namSinh) {
        this.maSv = maSv;
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ban hay nhap ma SV: ");
        this.setMaSv(scanner.nextLine());
        System.out.print("Ban hay nhap ho va ten: ");
        this.setHoVaTen(scanner.nextLine());
        System.out.print("Ban hay nhap nam sinh: ");
        this.setNamSinh(scanner.nextInt());
    }

    public void Display() {
        System.out.println("Ma SV: " + this.getMaSv());
        System.out.println("Ho va ten: " + this.getHoVaTen());
        System.out.println("Nam sinh: " + this.getNamSinh());
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

}
