import java.util.Scanner;

public class Product {
    private String tenHangHoa;
    private String nhaSanXuat;
    private float giaBan;

    public Product() {

    }

    public Product(String tenHangHoa, String nhaSanXuat, float giaBan) {
        this.tenHangHoa = tenHangHoa;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    public String getTenHangHoa() {
        return tenHangHoa;
    }

    public void setTenHangHoa(String tenHangHoa) {
        this.tenHangHoa = tenHangHoa;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten hang :");
        this.tenHangHoa = scanner.nextLine();
        System.out.println("Nhap nha SX :");
        this.nhaSanXuat = scanner.nextLine();
        System.out.println("Nhap Gia SP :");
        this.giaBan = scanner.nextFloat();
    }

    public void Xuat() {
        System.out.println("Ten hang :" + this.tenHangHoa);
        System.out.println("Nha SX :" + this.nhaSanXuat);
        System.out.println("Gia ban :" + this.giaBan);
    }

}
