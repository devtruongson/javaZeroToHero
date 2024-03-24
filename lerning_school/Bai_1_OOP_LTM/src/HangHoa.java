import java.util.Scanner;

public class HangHoa {
    private String tenHangHoa;
    private String nhaSx;
    private double gia;

    public HangHoa() {

    }

    public HangHoa(String tenHangHoa, String nhaSx, double gia) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSx = nhaSx;
        this.gia = gia;
    }

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Moi ban nhap ten hang hoa: ");
            this.setTenHangHoa(scanner.nextLine());
            System.out.print("Moi ban nhap nha SX hang hoa: ");
            this.setNhaSx(scanner.nextLine());
            System.out.print("Moi ban nhap Gia hang hoa: ");
            this.setGia(scanner.nextDouble());
        } catch (Exception e) {
            System.out.println("Ban da nhap sai kieu du lieu vui long nhap lai tu dau: " + e);
            scanner.nextLine();
            this.Input();
        }
    }

    public void Output() {
        System.out.println("Ten hang hoa la: " + this.getTenHangHoa());
        System.out.println("Nha SX hang hoa: " + this.getNhaSx());
        System.out.println("Gia hang hoa: " + this.getGia());
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSx() {
        return nhaSx;
    }

    public void setNhaSx(String nhaSx) {
        this.nhaSx = nhaSx;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}