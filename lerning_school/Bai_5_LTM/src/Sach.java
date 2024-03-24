import java.util.Scanner;

public class Sach extends TaiLieu {
    private String tenTacGia;
    private String tenSach;
    private int soTrang;

    public Sach() {
    }

    public Sach(String maTaiLieu, String nhaXb, int soBanPhatHanh, String tenTacGia, String tenSach, int soTrang) {
        super(maTaiLieu, nhaXb, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.tenSach = tenSach;
        this.soTrang = soTrang;
    }

    @Override
    public void Input() {
        super.Input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Moi ban nhap ten tac gia : ");
        this.setTenTacGia(scanner.nextLine());
        System.out.print("Moi ban nhap ten sach : ");
        this.setTenSach(scanner.nextLine());
        System.out.print("Moi ban nhap so trang : ");
        this.setSoTrang(scanner.nextInt());
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Ten tac gia sach : " + this.getTenTacGia());
        System.out.println("Ten sach : " + this.getTenSach());
        System.out.println("So trang sach : " + this.getSoTrang());
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

}